package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by xiao
 * @Classname FeignServerApplication
 * @Description
 * @Date 2020-06-27 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FeignServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerApplication.class, args);
    }
}
