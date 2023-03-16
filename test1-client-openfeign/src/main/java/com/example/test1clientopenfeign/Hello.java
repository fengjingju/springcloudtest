package com.example.test1clientopenfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Hello {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/hello-client")
    public String hello() {
        return feignService.hello();
    }
}

