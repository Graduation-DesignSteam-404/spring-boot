package com.springboot.jian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JianApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianApplication.class, args);
    }

}
