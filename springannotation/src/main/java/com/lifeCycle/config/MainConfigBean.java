package com.lifeCycle.config;

import com.lifeCycle.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
*
*   构造(对象创建):
*       单实例: 在容器启动的时候创建
*       多实例: 在每次获取时创建
*
*   初始化:
*       对象初始化并开始赋值 调用初始化方法
*   销毁:
*       单例 容器关闭的时候
*       prototype 容器不会管理这个bean 容器不会调用这个方法
*
*   初始化和销毁 注解
*       通过@Bean的initMethod = "",destroyMethod=""
*
* */
@Configuration
public class MainConfigBean {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

}
