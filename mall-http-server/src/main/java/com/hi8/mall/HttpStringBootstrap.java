package com.hi8.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 1:25
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.hi8.mall"})
@MapperScan("com.hi8.mall.mapper")
public class HttpStringBootstrap{
    public static void main(String[] args) {
        SpringApplication.run(HttpStringBootstrap.class, args);
    }



}
