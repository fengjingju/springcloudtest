package com.example.test1client;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GlobalTransactional
    @RequestMapping("/insertUser")
    public String insertUser() {
        jdbcTemplate.execute("INSERT INTO user_inf (user_id,user_name) VALUES ('123','张三')");
        return restTemplate.getForObject("http://test1/insertUser", String.class);
    }
}
