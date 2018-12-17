package net.yyy.redis;

import net.yyy.entity.User;
import net.yyy.service.TestService;
import net.yyy.service.TestServiceImpl;
import net.yyy.service.UserService;
import net.yyy.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub {
    @Autowired
    private TestService testService = new TestServiceImpl();

    public Subscriber() {
    }

    public void onMessage(String channel, String message) {
        testService.test();
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(String.format("receive redis published message, channel %s, message %s", channel, message));
    }

    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("subscribe redis channel success, channel %s, subscribedChannels %d", 
                channel, subscribedChannels));
    }

    public void onUnsubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("unsubscribe redis channel, channel %s, subscribedChannels %d", 
                channel, subscribedChannels));

    }
}
