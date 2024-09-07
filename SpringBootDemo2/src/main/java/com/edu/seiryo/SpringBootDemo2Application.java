package com.edu.seiryo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.edu.seiryo.mapper")
public class SpringBootDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo2Application.class, args);
    }
}
