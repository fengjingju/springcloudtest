package com.example.test1client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class Hello {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello-client")
    public String hello() {
        return restTemplate.getForObject("http://test1/hello", String.class);
    }
}

