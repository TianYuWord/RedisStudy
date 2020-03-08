package cn.tianyu20.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis 工具类 ： 用于获取 redis-cli 连接 ， 达到异步的效果
 */
public class RedisPoolUtil {

    private static JedisPool pool = null;
    private static String password = "123456";
    private static final String host = "192.168.0.105";
    private static final Integer port = 6379;

    static {
        //配置连接池 Redis POOL 基本配置信息
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大连接数
        poolConfig.setMaxTotal(5);
        //最大空闲数
        poolConfig.setMaxIdle(1);
        //通过poolConfig创建连接池
        pool = new JedisPool(poolConfig,host,port);
    }

    /*
    获得redis连接
    * */
    public static Jedis getJedis(){
        Jedis jedis = jedis = pool.getResource();
        jedis.auth(password);
        return jedis;
    }

    //关闭redis连接
    public static void close(Jedis jedis){
        jedis.close();
    }

}
