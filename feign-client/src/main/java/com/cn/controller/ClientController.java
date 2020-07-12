package com.cn.controller;

import com.cn.service.CalRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by xiao
 * @Classname ClientController
 * @Description
 * @Date 2020-06-27 16:01
 * 客户端本身可以调用，也能提供给其他服务调用。
 */
@RestController
@RequestMapping("/test")
public class ClientController {

    @Autowired
    private CalRemoteService calRemoteService;

    @RequestMapping("/testAdd")
    public String rAdd(@RequestParam Integer a, @RequestParam Integer b) {
        return a + "+" + b + "的Feign调用结果为：" + calRemoteService.add(a, b);
    }
}
