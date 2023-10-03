package org.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.model.dao")
public class RaindropBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(RaindropBlogApplication.class, args);
    }
}
