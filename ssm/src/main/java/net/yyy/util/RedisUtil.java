package net.yyy.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.params.SetParams;

import java.util.ArrayList;
import java.util.List;

public class RedisUtil {

    private static JedisPool jedisPool = null;

    public static JedisPool getJedisPool() {
        if (jedisPool == null) {
            String redisIp = "localhost";
            int redisPort = 6379;
            jedisPool = new JedisPool(new JedisPoolConfig(), redisIp, redisPort);
            System.out.println(String.format("redis pool is starting, redis ip %s, redis port %d", redisIp, redisPort));
        }
        return jedisPool;
    }
    private static Jedis jedis = new Jedis("localhost");

    public static String getLock(String key) {
        SetParams params = new SetParams().ex(1).nx();
        while (true) {
            String lock = key + System.currentTimeMillis();
            String txVal = jedis.set(key, lock, params);
            System.out.println(txVal);
            if (txVal != null) {
                System.out.println("get redis lock for key: " + key + ", val: " + lock);
                return lock;
            }
            System.out.println("failed to get redis lock for key: " + key + ", val: " + lock);
        }
    }

    private static String script = "if redis.call(\"get\", KEYS[1]) == ARGV[1]\n" +
            "then\n" +
            "return redis.call(\"del\",KEYS[1])\n" +
            "else\n" +
            "return 0\n" +
            "end\n";

    public static void releaseLock(String key, String val) {
        List<String> keys = new ArrayList<>();
        List<String> args = new ArrayList<>();
        keys.add(key);
        args.add(val);
        System.out.println(jedis.eval(script, keys, args));
    }

}
