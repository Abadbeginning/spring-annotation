package com.lifeCycle.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MainConfigBeanTest {

    /*
    *
    *       测试car 初始化
    *           @Bean(initMethod = "自定义的方法名",destroyMethod = "自定义方法名")
    *
    * */
    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigBean.class);
        System.out.println("容器创建成功!!");
        annotationConfigApplicationContext.close();
    }

    /*
    *
    *   接口的实现
    *      实现相对应的初始化 销毁方法
    *
    * */
    @Test
    public void test1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigBean.class);
        System.out.println("容器创建成功!!");
        annotationConfigApplicationContext.close();
    }
}
