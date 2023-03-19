package com.example.test1.config;

import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateConfig {

    @Bean
    public JdbcTemplate setJdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(new DataSourceProxy(dataSource));
    }
}
