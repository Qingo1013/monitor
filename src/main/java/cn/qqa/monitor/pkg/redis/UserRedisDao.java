package cn.qqa.monitor.pkg.redis;


import cn.qqa.monitor.pkg.redis.constant.UserConstants;
import cn.qqa.monitor.pkg.redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;
/**
 * @author qingo
 * @date 2022/12/21 10:31
 **/
@Repository
public class UserRedisDao {
    @Autowired
    private RedisUtil redisUtil;

    /**
     * 写入CaptchaKey
     *
     * @param key
     * @param value
     * @param expire
     * @return
     */
    public String setCaptchaKey(final String key, String value, long expire, TimeUnit timeUnit) {
        String realKey = UserConstants.CAPTCHA_KEY + key;
        redisUtil.set(realKey, value, expire, timeUnit);
        return realKey;
    }

    /**
     * redis根据key删除对应的value
     *
     * @param key
     * @return
     */
    public void remove(final String key) {
        redisUtil.remove(key);
    }

    /**
     * 判断redis缓存中是否有对应的key
     *
     * @param key
     * @return
     */
    public Boolean exists(final String key) {
        return redisUtil.exists(key);
    }

    /**
     * 读取redis缓存
     *
     * @param key
     * @return
     */
    public String get(final String key) {
        return redisUtil.get(key);
    }

}
