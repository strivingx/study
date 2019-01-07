package net.yyy.web;

import net.yyy.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.UUID;

@RestController
public class IndexController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }

    @RequestMapping("/like")
    public String like() {
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);

        return "welcome";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String pubsub(String name) {
        Jedis jedis = RedisUtil.getJedisPool().getResource();
        System.err.println("input " + name);
        jedis.publish("mychannel", name);

        String message = name;
        ListenableFuture future = kafkaTemplate.send("app_log", message);
        future.addCallback(o -> System.out.println("send-消息发送成功：" + message), throwable -> System.out.println("消息发送失败：" + message));

        try {
            System.out.println("kafka的消息=" + message);
            kafkaTemplate.send("app_log", "key", message);
        } catch (Exception e) {
            System.out.println("发送kafka失败");
        }
        return "welcome";
    }
}

