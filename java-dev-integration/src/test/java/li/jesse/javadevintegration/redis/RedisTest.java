package li.jesse.javadevintegration.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getValue() {
        String str = (String) redisTemplate.boundValueOps("mykey").get();
        System.out.println(str);
    }
}
