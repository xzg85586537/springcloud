package com.cn.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by xiao
 * @Classname ConfigClientController
 * @Description
 * @Date 2020-06-22 22:20
 */
@RestController
public class ConfigClientController {
    @Value("${name}")
    private String name;

    @GetMapping("/get")
    public String getName(@RequestParam String name) {
        return name;
    }
}
