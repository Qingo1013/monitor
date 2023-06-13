package cn.qqa.monitor.pkg.redis.util;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * redis工具实现类
 *
 * @author qingo
 * @date 2022/12/21 9:33
 */
@Component
@Slf4j
public class RedisUtilImpl implements RedisUtil {
    private StringRedisTemplate redisTemplate;
    private RedissonClient redissonClient;

    public RedisUtilImpl(StringRedisTemplate redisTemplate, RedissonClient redissonClient) {
        this.redisTemplate = redisTemplate;
        this.redissonClient = redissonClient;
        this.valueOperations = redisTemplate.opsForValue();
        this.hashOperations = redisTemplate.opsForHash();
        this.setOperations = redisTemplate.opsForSet();
    }

    @Override
    public void readLockAndRun(String lockName, Runnable runnable) {
        RReadWriteLock lock = redissonClient.getReadWriteLock(lockName);
        RLock rLock = lock.readLock();
        rLock.lock();
        try {
            runnable.run();
        } catch (Exception e) {
            throw e;
        } finally {
            rLock.unlock();
        }
    }

    @Override
    public void writeLockAndRun(String lockName, Runnable runnable) {
        RReadWriteLock lock = redissonClient.getReadWriteLock(lockName);
        RLock rLock = lock.writeLock();
        rLock.lock();
        try {
            runnable.run();
        } catch (Exception e) {
            throw e;
        } finally {
            rLock.unlock();
        }
    }

    @Override
    public void lockAndRun(String lockName, Runnable runnable) {
        RLock rlock = redissonClient.getLock(lockName);
        rlock.lock();
        try {
            runnable.run();
        } catch (Exception e) {
            throw e;
        } finally {
            rlock.unlock();
        }
    }

    @Override
    public <T> T lockAndRun(String lockName, Supplier<T> supplier) {
        RLock rlock = redissonClient.getLock(lockName);
        rlock.lock();
        try {
            return supplier.get();
        } finally {
            rlock.unlock();
        }
    }

    private ValueOperations<String, String> valueOperations;
    private HashOperations<String, String, String> hashOperations;
    private SetOperations<String, String> setOperations;

    @Override
    public Object eval(final String script, Class<?> clazz, List keys, Object... argv) {
        DefaultRedisScript redisScript = new DefaultRedisScript();
        redisScript.setScriptText(script);
        redisScript.setResultType(clazz);
        return redisTemplate.execute(redisScript, keys, argv);
    }

    @Override
    public void set(final String key, String value) {
        valueOperations.set(key, value);
    }

    @Override
    public Boolean setIfAbsent(final String key, String value, long timeOut, TimeUnit timeUnit) {
        return valueOperations.setIfAbsent(key, value, timeOut, timeUnit);
    }


    @Override
    public void set(final String key, String value, long expire, TimeUnit timeUnit) {
        valueOperations.set(key, value);
        redisTemplate.expire(key, expire, timeUnit);
    }


    @Override
    public String get(final String key) {
        return valueOperations.get(key);
    }


    @Override
    public Set getAllByPrefix(String pre) {
        return redisTemplate.keys(pre + "*");
    }


    @Override
    public Long increment(final String key, int delta) {
        if (delta < 0) {
            throw new RuntimeException("递增因子必须大于0");
        }
        return valueOperations.increment(key, delta);
    }

    @Override
    public Long decrement(final String key, long delta) {
        if (delta < 0) {
            throw new RuntimeException("递减因子必须大于0");
        }
        return valueOperations.decrement(key, delta);
    }


    @Override
    public Map<String, String> getMap(String key) {
        Set<String> keys = redisTemplate.keys(key);
        Map<String, String> map = new HashMap<>();
        if (CollectionUtils.isEmpty(keys)) {
            return map;
        }
        for (String accurateKey : keys) {
            String cacheValue = get(accurateKey);
            map.put(accurateKey, cacheValue);
        }
        return map;
    }


    @Override
    public Long getSetSize(String key) {
        return setOperations.size(key);
    }

    @Override
    public List<String> getElementsFromSet(String key, long count) {
        return setOperations.pop(key, count);
    }


    @Override
    public Long addElementsToSet(String key, String... elements) {
        return setOperations.add(key, elements);
    }

    @Override
    public Boolean isSetMember(String key, String element) {
        return setOperations.isMember(key, element);
    }

    @Override
    public Boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public Boolean existsRedisErrWithTrue(final String key) {
        return redisTemplate.hasKey(key);
    }


    @Override
    public void remove(final String key) {
        redisTemplate.delete(key);
    }

    @Override
    public void removeAll(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }


    @Override
    public Boolean setIfAbsent(String key, long expire, TimeUnit timeUnit) {
        return valueOperations.setIfAbsent(key, "0", expire, timeUnit);
    }

    @Override
    public Boolean setIfAbsent(String key, String value) {
        return valueOperations.setIfAbsent(key, value);
    }

    @Override
    public void expireAt(String key, long l) {
        redisTemplate.expireAt(key, new Date(l));
    }

    @Override
    public void removeAllByPrefix(String pre) {
        Set<String> keys = redisTemplate.keys(pre + "*");
        if (!CollectionUtils.isEmpty(keys)) {
            redisTemplate.delete(keys);
        }
    }


    @Override
    public RLock getLockDistributed(String key) {
        return redissonClient.getLock(key);
    }


    @Override
    public boolean tryLockDistributed(RLock lock) {
        if (lock.tryLock()) {
            log.info(Thread.currentThread().getName() + "获取分布式锁成功");
            return true;
        }
        log.info(Thread.currentThread().getName() + "获取分布式锁失败");
        return false;
    }

    @Override
    public void unlockDistributed(RLock lock) {
        lock.unlock();
    }


    @Override
    public void lockDistributed(RLock lock) {
        lock.lock();
    }


    @Override
    public String getFromHash(String k, String hk) {

        return hashOperations.get(k, hk);
    }


    @Override
    public void setToHash(String k, String hk, String hv) {
        hashOperations.put(k, hk, hv);
    }

    @Override
    public void expire(String k, long expire, TimeUnit timeUnit) {
        redisTemplate.expire(k, expire, timeUnit);
    }

    @Override
    public Long ttl(String k, TimeUnit timeUnit) {
        return redisTemplate.getExpire(k, timeUnit);
    }
}

