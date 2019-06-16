package com.example.imsconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableDiscoveryClient
public class ImsConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImsConfigClientApplication.class, args);
    }

}
