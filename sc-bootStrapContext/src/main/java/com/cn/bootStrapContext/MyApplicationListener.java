package com.cn.bootStrapContext;

import org.springframework.context.ApplicationListener;

/**
 * @author by xiao
 * @Classname MyApplicationListener
 * @Description
 * @Date 2020-06-22 18:22
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("监听器监听到了：" + myApplicationEvent.getSource());
    }
}
