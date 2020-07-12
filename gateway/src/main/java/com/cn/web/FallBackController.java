package com.cn.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by xiao
 * @Classname FallBackController
 * @Description
 * @Date 2020-07-12 13:35
 */
@RestController
public class FallBackController {

    @GetMapping("/fallback")
    public String fallback() {
        return "springcloud 熔断";
    }
}
