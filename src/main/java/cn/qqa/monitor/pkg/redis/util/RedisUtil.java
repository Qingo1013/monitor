package cn.qqa.monitor.pkg.redis.util;

/**
 * redis工具类
 * @author qingo
 * @date 2022/12/21 9:30
 */

import org.redisson.api.RLock;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public interface RedisUtil{

    void readLockAndRun(String lockName, Runnable runnable);

    void writeLockAndRun(String lockName, Runnable runnable);

    void lockAndRun(String lockName, Runnable runnable);

    <T> T lockAndRun(String lockName, Supplier<T> supplier);

    Object eval(String script, Class<?> clazz, List keys, Object... argv);

    /**
     * 写入redis缓存（不设置expire存活时间）
     *
     * @param key
     * @param value
     * @return
     */
    void set(String key, String value);


    Boolean setIfAbsent(String key, String value, long timeOut, TimeUnit timeUnit);

    /**
     * 写入redis缓存（设置expire存活时间）
     *
     * @param key
     * @param value
     * @param expire
     * @param timeUnit
     */
    void set(String key, String value, long expire, TimeUnit timeUnit);

    /**
     * 读取redis缓存
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 根据前缀查询key
     *
     * @param pre
     */
    Set<String> getAllByPrefix(String pre);

    /**
     * 增加key所对应的value值+1
     *
     * @param key
     * @return
     */
    Long increment(String key, int delta);

    /**
     * 递减
     *
     * @param key 键
     * @return
     */
    Long decrement(String key, long delta);

    /**
     * 从缓存中获取资源信息Map
     *
     * @param key 键
     * @return 缓存信息map
     */
    Map<String, String> getMap(String key);

    /**
     * 获取redis中set的大小
     *
     * @param key
     * @return
     */
    Long getSetSize(String key);

    /**
     * 获取redis中set的随机count个元素
     *
     * @param key
     * @return
     */
    List<String> getElementsFromSet(String key, long count);

    /**
     * 向redis中的set插入元素
     *
     * @param key
     * @param elements
     * @return
     */
    Long addElementsToSet(String key, String... elements);

    /**
     * set中是否存在该元素
     *
     * @param key
     * @param element
     * @return
     */
    Boolean isSetMember(String key, String element);

    /**
     * 判断redis缓存中是否有对应的key
     *
     * @param key
     * @return
     */
    Boolean exists(String key);

    /**
     * redis异常时返回true
     */
    Boolean existsRedisErrWithTrue(String key);

    /**
     * redis根据key删除对应的value
     *
     * @param key
     * @return
     */
    void remove(String key);

    /**
     * redis根据keys批量删除对应的value
     *
     * @param keys
     * @return
     */
    void removeAll(String... keys);

    /**
     * 设值
     *
     * @param key      键
     * @param expire   过期时间
     * @param timeUnit 时间单位
     * @return
     */
    Boolean setIfAbsent(String key, long expire, TimeUnit timeUnit);

    Boolean setIfAbsent(String key, String value);

    void expireAt(String key, long l);

    /**
     * 根据前缀批量删除key
     *
     * @param pre
     */
    void removeAllByPrefix(String pre);

    /**
     * 根据锁名称获取分布式锁
     *
     * @param key
     * @return
     */
    RLock getLockDistributed(String key);

    /**
     * 尝试加锁，无论成功或失败立刻返回尝试结果
     *
     * @param lock
     * @return
     */
    boolean tryLockDistributed(RLock lock);

    /**
     * 解除分布式锁
     *
     * @param lock
     */
    void unlockDistributed(RLock lock);

    /**
     * 分布式锁上锁，上锁失败则重试直到成功
     *
     * @param lock
     */
    void lockDistributed(RLock lock);

    /**
     * 获取redis中的hash值
     *
     * @param k
     * @param hk
     * @return
     */
    String getFromHash(String k, String hk);

    /**
     * 向redis中插入hash值
     *
     * @param k
     * @param hk
     * @param hv
     */
    void setToHash(String k, String hk, String hv);

    /**
     * 设置过期时间
     *
     * @param k
     * @param expire
     * @param timeUnit
     */
    void expire(String k, long expire, TimeUnit timeUnit);

    /**
     * 获取键的剩余过期时间，并且按照timeUnit转换为指定时间长度
     */
    Long ttl(String k, TimeUnit timeUnit);
}

