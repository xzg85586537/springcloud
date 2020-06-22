package com.cn.bootStrapContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by xiao
 * @Classname SpringCloudEventListener
 * @Description
 * @Date 2020-06-22 18:21
 */

public class SpringCloudEventListener {
    public static void main(String[] args) {
        //创建注解型的上下午配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //添加监听器
        context.addApplicationListener(new MyApplicationListener());
        //注册Configuration
        context.register(MyApplicationListener.class);
        //启动上下文
        context.refresh();
        //发布事件，当事件发布时，监听器会监听到，再控制台打印信息
        context.publishEvent(new MyApplicationEvent("事件发布"));
    }
}
