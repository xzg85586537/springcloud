package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by xiao
 * @Classname com.cn.Gate1Application
 * @Description
 * @Date 2020-06-27 21:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Gate1Application {
    public static void main(String[] args) {
        SpringApplication.run(Gate1Application.class, args);
    }
}
