package com.tt.news;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tt.news.dao")
public class NewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class,args);
    }
}
