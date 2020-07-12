package com.cn.service.impl;

import com.cn.service.CalRemoteService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author by xiao
 * @Classname CalRemoteServiceImpl
 * @Description
 * @Date 2020-06-27 15:52
 */
@Component
@Slf4j
public class CalRemoteServiceFallBackImpl implements CalRemoteService {

    @Setter
    Throwable cause;

    @Override
    public String add(Integer a, Integer b) {
        log.error("feign调用add方法失败", cause);
        return null;
    }
}
