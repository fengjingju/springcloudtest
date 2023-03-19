package com.example.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/insertUser")
//    @Transactional(rollbackFor = Exception.class)
    public String insertUser() throws Exception {
        jdbcTemplate.execute("INSERT INTO user_inf (user_id,user_name) VALUES ('456','李四')");
        throw new Exception("故意的exception");
//        return "insert zhangsan & lisi success";
    }
}
