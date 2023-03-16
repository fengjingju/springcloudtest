package com.example.test3serverdubbo;

import com.example.test3dubboapi.*;
import com.example.test3dubboapi.domain.HelloRequest;
import com.example.test3dubboapi.domain.HelloResponse;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloResponse hello(HelloRequest request) {
        return new HelloResponse("hello world");
    }
}
