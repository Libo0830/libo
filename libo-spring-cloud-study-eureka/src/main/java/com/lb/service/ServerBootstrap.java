package com.lb.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * server 启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ServerBootstrap.class, args);
    }
}
