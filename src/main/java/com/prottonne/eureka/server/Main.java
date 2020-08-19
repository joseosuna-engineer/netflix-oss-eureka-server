package com.prottonne.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Main {

    public Main() {
        super();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
