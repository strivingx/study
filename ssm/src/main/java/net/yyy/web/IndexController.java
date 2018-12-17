package net.yyy.web;

import net.yyy.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
	    return "welcome";
    }

    @RequestMapping("/like")
    public String like(){
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);

        return "welcome";
    }


    @RequestMapping("/register")
    public String pubsub(String name) {
        Jedis jedis = RedisUtil.getJedisPool().getResource();
        System.err.println("input " + name);
        jedis.publish("mychannel", name);
        return "welcome";
    }
}

