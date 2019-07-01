package com.lb.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class, args);
    }
}
