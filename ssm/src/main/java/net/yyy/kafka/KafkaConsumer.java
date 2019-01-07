package net.yyy.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * 使用@KafkaListener注解,可以指定:主题,分区,消费组
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"app_log"})
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println("kafka的key: " + record.key() + ". kafka的value: " + record.value().toString());
    }

    @KafkaListener(topics = {"app_log"})
    public void receive(String message) {
        System.out.println("app_log--消费消息:" + message);
    }


}
