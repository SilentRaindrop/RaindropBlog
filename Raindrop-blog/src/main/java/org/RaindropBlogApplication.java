package org;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
@MapperScan("org.model.dao")
public class RaindropBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(RaindropBlogApplication.class, args);
    }
}
