package com.example.test3dubboapi;

import com.example.test3dubboapi.domain.HelloRequest;
import com.example.test3dubboapi.domain.HelloResponse;

public interface HelloService {

    HelloResponse hello(HelloRequest request);
}
