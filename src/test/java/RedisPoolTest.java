import cn.tianyu20.util.RedisPoolUtil;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * redis 线程池测试
 */
public class RedisPoolTest {


    @Test
    public void RedisPool(){
        Jedis jedis = RedisPoolUtil.getJedis();
        System.out.println(jedis.get("name"));
        RedisPoolUtil.close(jedis);
    }


}
