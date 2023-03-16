package com.example.test3clientdubbo;

import com.example.test3dubboapi.HelloService;
import com.example.test3dubboapi.domain.HelloResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Hello {

    @DubboReference
    private HelloService helloService;

    @RequestMapping("/hello-client")
    public HelloResponse hello() {
        return helloService.hello(null);
    }
}