package com.cn.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by xiao
 * @Classname TestController
 * @Description
 * @Date 2020-06-27 21:53
 */
@RestController
public class Test2Controller {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello！I'm a. port：" + port;
    }

    @GetMapping("/name")
    public String name(String name) {
        return "我的名字是：" + name;
    }

    @GetMapping("/age")
    public String age(String age) {
        return "我今年：" + age + "岁.2222";
    }

    @GetMapping("/routeAll")
    public String routAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }

}
