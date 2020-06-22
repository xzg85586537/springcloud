BootStrapContext是SpringCloud新引入的上下文，与传统Spring 上下文一样，
是ConfigurableApplicationContext实例，由BootStrapApplicationListener监听ApplicationEnvironmentPreparedEvent时
创建，即应用环境准备完毕时创建。
BootStrapContext是用户ApplicationContext的父级上下文，所以非常重要，也在SpringCloud官方文档中第一个被提及。

1.事件/监听模式
对于Spring来说，具有大量的组件是基于事件/监听机制来初始化的，而对于事件和监听分别有两个根类：ApplicationEvent和
ApplicationListener。
比如我们自己写的这个类，先写一个MyApplicationEvent事件类，而MyApplicationListener监听此事件，在main方法中，
首先我把监听器添加到上下文，当MyApplicationEvent事件发布时，监听器监听到，然后会把发布的源信息打印到控制台。

而对于BootStrapContext也是使用的事件/监听机制创建，就如我们上面介绍的，当ApplicationEnvironmentPreparedEvent这个应用
环境准备就绪事件发生时，由BootStrapApplicationListener监听到，然后便会创建BootStrapContext对象

Actuator Endpoints
传动器端点，这个其实是SpringBoot中的东西，但是之前没有了解，这里简单学习下，因为SpringCloud会大量使用到，来进行
监控及健康检查。
Actuator Endpoints主要是SpringBoot为“生产环境准备的特性“，通过http访问，对相关人员管理监控应用，分为监控类与管理类：
监控类：env（环境属性），health（健康检查），mappings（URL路径），端点信息，应用信息，指标信息，beans（Bean管理）等
管理类：dump（活动线程），外部化配置，日志配置，关闭应用
在SpringBoot1.5以后，提高了Actuator的安全性，需要在配置文件中开启才可以访问
management.security.enabled=false

SpringCloud对Endpoints的拓展
主要使用的有三个

重启：/restart，需要设置敏感性与启

# 全局安全控制
#management.security.enabled=false
# 设置endpoint的启动
endpoints.restart.enabled=true
# sensitive = false 安全不明感，细粒度的安全控制
endpoints.restart.sensitive = false

暂停：/pause
恢复：/resume

