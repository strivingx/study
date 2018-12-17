package net.yyy;

import net.yyy.redis.SubThread;
import net.yyy.util.RedisUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("net.yyy.dao")
@EnableCaching
public class SsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmApplication.class, args);
		SubThread subThread = new SubThread(RedisUtil.getJedisPool());
		subThread.start();
	}

}

