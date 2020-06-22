package com.cn.bootStrapContext;

import org.springframework.context.ApplicationEvent;

/**
 * @author by xiao
 * @Classname MyApplicationEvent
 * @Description 继承一个根的Event类
 * @Date 2020-06-22 18:23
 */
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
