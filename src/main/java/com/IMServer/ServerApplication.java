package com.IMServer;

import com.IMServer.messagingredis.MessagingRedisApplication;
import com.IMServer.messagingredis.Receiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.StringRedisTemplate;

@ComponentScan
@SpringBootApplication
@Import(MessagingRedisApplication.class)
public class ServerApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ServerApplication.class, args);
//        ApplicationContext ctx = SpringApplication.run(MessagingRedisApplication.class, args);
        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
        Receiver receiver = ctx.getBean(Receiver.class);
        while (receiver.getCount() == 0) {
            System.out.println("Sending message...");
            template.convertAndSend("chat", "Hello from Redis");
        }
    }
}