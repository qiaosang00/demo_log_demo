package com.example.demo_log_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.Mapping;

@MapperScan("com.example.demo_log_demo.mapper")
@SpringBootApplication
public class DemoLogDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLogDemoApplication.class, args);
    }

}
