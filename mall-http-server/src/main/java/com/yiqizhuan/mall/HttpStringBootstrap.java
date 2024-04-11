package com.yiqizhuan.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 1:25
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.yiqizhuan.mall"})
@MapperScan("com.yiqizhuan.mall.mapper")
public class HttpStringBootstrap{
    public static void main(String[] args) {
        SpringApplication.run(HttpStringBootstrap.class, args);
    }



}
