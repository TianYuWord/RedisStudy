import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class helloRedis {

    private static final String host = "192.168.0.105";
    private static final Integer port = 6379;
    private static final String password = "123456";
    Jedis jedis = null;

    @Before
    public void init(){

        //配置连接池 Redis POOL 基本配置信息
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大连接数
        poolConfig.setMaxTotal(5);
        //最大空闲数
        poolConfig.setMaxIdle(1);
        //通过poolConfig创建连接池
        JedisPool pool = new JedisPool(poolConfig,"192.168.0.105");
        //通过Pool获得Jedis
        jedis = pool.getResource();
        jedis.auth("123456");
    }

    @Test
    public void HelloTest(){
        jedis.set("name","helloRedis");
        String name = jedis.get("name");
        System.out.println(name);
    }

    @Test
    public void RedisExists(){
        String key = "name";
        jedis.set(key,"数据库的内容");
        if(jedis.exists(key)){
            System.out.println(jedis.get(key));
        }
    }

    @After
    public void destroy(){
        jedis.close();
    }


}