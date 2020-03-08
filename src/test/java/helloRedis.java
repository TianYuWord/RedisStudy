import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import redis.clients.jedis.Jedis;


public class helloRedis {

    private static final String host = "192.168.0.105";
    private static final Integer port = 6379;
    private static final String password = "123456";

    @Test
    public void HelloTest(){
        Jedis jedis = new Jedis(host,port);
        jedis.auth("123456");

        jedis.set("name","helloRedis");
        String name = jedis.get("name");
        System.out.println(name);

        jedis.close();
    }
}
