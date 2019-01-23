package com.lifeCycle.config;

import com.example.conditional.MyFactoryBean;
import com.lifeCycle.bean.Car;
import com.lifeCycle.bean.Goose;
import com.lifeCycle.bean.MyFeet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
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
*   初始化和销毁
*    1、注解
*       通过@Bean的initMethod = "",destroyMethod=""
*
*    2、通过接口实现相对的销毁 初始化方法
*       (implements InitializingBean(定义初始化逻辑), DisposableBean(定义销毁逻辑))
*
*   3、使用JSR250
*       // 在bean创建完成并赋值 容器执行初始化
         @PostConstruct

         // 在容器销毁bean之前 进行方法的清理工作
        @PreDestroy

    4、

*
* */
@Configuration
@Import({MyFeet.class, Goose.class})
public class MainConfigBean {

   // @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

    /*public MyFactoryBean myFactoryBean(){

    }*/



}
