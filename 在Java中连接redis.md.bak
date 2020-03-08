###在Java中连接Redis
要保证redis-sverer是开启状态
## 步骤1：添加Maven的依赖
'''
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>3.2.0</version>
</dependency>
'''

## 步骤2：在IDE中创建测试类
'''
@Test
public void ti{
    Jedis jedis = new Jedis("192.168.0.105",6379);
    jedis.auth("123456")//输入密码
    String strName = jedis.get("strName");
    System.out.println("Redis中的集群："+strName);
    jedis.close();
}
'''

执行即可连接redis-sevrer

##Redis作用
作用：为了减轻数据库（Mysql）的访问压力
需求：判断某KEY是否存在，如果存在，就从Redis中查询，如果不存在就查询数据库，且要将查询的数据存入Redis