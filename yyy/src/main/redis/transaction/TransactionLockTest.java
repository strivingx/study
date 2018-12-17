package transaction;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

import java.util.ArrayList;
import java.util.List;

/**
 * http://redisdoc.com/string/set.html
 * redis 事务锁测试。
 * 使用set nx ex
 * nx来控制一个key是否被别的事务处理
 * ex防止异常情况导致一个锁被长时间占用而阻塞请求。
 * 使用lua脚本来原子性删除事务中同时满足key，value的数据。
 */
public class TransactionLockTest {
    private static Jedis jedis = new Jedis("localhost");

    public static void main(String[] args) {
        String key = "test_tx";
        System.out.println("start to get first lock. it will be success");
        String lock = getLock(key);
        System.out.println("start to get second lock. it will be failed");
        String lock2 = getLock(key);
        System.out.println(jedis.get(key));
        System.out.println("start to release first lock. it will be failed because it is expired.");
        releaseLock(key, lock);
        System.out.println("start to release second lock. it will be success.");
        releaseLock(key, lock2);
        System.out.println(jedis.get(key));
    }

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
