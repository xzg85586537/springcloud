package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by xiao
 * @Classname ServerController
 * @Description
 * @Date 2020-06-27 16:05
 */
@RestController
@RequestMapping("/cal")
public class ServerController {

    @RequestMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a + b;
    }
}
