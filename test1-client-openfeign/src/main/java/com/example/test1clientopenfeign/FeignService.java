package com.example.test1clientopenfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "test1")
@Service
public interface FeignService {

    @RequestMapping("/hello")
    String hello();
}
