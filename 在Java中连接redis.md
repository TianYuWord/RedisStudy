###��Java������Redis
Ҫ��֤redis-sverer�ǿ���״̬
## ����1�����Maven������
'''
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>3.2.0</version>
</dependency>
'''

## ����2����IDE�д���������
'''
@Test
public void ti{
    Jedis jedis = new Jedis("192.168.0.105",6379);
    jedis.auth("123456")//��������
    String strName = jedis.get("strName");
    System.out.println("Redis�еļ�Ⱥ��"+strName);
    jedis.close();
}
'''

ִ�м�������redis-sevrer

##Redis����
���ã�Ϊ�˼������ݿ⣨Mysql���ķ���ѹ��
�����ж�ĳKEY�Ƿ���ڣ�������ڣ��ʹ�Redis�в�ѯ����������ھͲ�ѯ���ݿ⣬��Ҫ����ѯ�����ݴ���Redis