package com.atguigu.rabbitmqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
        System.out.println("this is master change ");
    }

}
