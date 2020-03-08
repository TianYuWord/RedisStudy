import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;


public class helloRedis {

    private static final String host = "192.168.0.105";
    private static final Integer port = 6379;
    private static final String password = "123456";
    Jedis jedis = null;

    @Before
    public void init(){
        jedis = new Jedis(host,port);
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