package com.lb.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * client 启动类
 */

@SpringBootApplication
@EnableEurekaClient
public class ClientBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ClientBootstrap.class, args);
    }
}
