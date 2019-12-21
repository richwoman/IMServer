package com.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
    public  static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("sever start");
        int port = 8000;
        new Server(port).run();
    }

}
