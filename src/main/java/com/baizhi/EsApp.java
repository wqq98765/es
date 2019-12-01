package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("con.baizhi.dao")
public class EsApp {
    public static void main(String[] args) {
        SpringApplication.run(EsApp.class, args);
    }
}
