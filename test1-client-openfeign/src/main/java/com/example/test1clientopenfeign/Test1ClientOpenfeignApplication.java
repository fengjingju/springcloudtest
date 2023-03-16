package com.example.test1clientopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Test1ClientOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test1ClientOpenfeignApplication.class, args);
    }

}
