package com.lifeCycle.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class MainConfigBeanTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigBean.class);
        System.out.println("容器创建成功!!");
        annotationConfigApplicationContext.close();
    }
}
