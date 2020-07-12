package com.cn.factory;

import com.cn.service.CalRemoteService;
import com.cn.service.impl.CalRemoteServiceFallBackImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author by xiao
 * @Classname RemoteFactory
 * @Description
 * @Date 2020-06-27 15:51
 */
@Component
public class RemoteFactory implements FallbackFactory<CalRemoteService> {

    @Override
    public CalRemoteService create(Throwable throwable) {
        CalRemoteServiceFallBackImpl fallBack = new CalRemoteServiceFallBackImpl();
        fallBack.setCause(throwable);
        return fallBack;
    }
}
