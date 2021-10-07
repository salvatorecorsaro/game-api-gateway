package com.example.gameapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GameApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameApiGatewayApplication.class, args);
    }

}
