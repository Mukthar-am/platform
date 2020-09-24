package com.muks.redis;

import org.redisson.api.RMap;
import org.testng.Assert;
import org.testng.annotations.Test;

// java -cp <.jar> com.caffeine.fleet.examples.RedissionEx
public class TestRedis {

    @Test
    public void testSanity() {
        RedisManager redisManager = new RedisManager().startServer();

        RMap user = redisManager.addMap("user");
        user.put("muks", "78");
        Assert.assertEquals("78", user.get("muks"));

        redisManager.stopServer();
    }

}
