package com.example.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class TestFactoryBeanTest {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
            new AnnotationConfigApplicationContext(TestFactoryBean.class);

    @Test
    public void myFactoryBean() {
        String[] definitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String name : definitionNames){
            System.err.println(name);
        }

        Object object = annotationConfigApplicationContext.getBean("myFactoryBean");
        System.out.println("bean类型 -> " + object.getClass());
        Object object1 = annotationConfigApplicationContext.getBean("myFactoryBean");
        System.out.println(object == object1);
        // 想要获取myFactoryBean类 而不是bean类 需要加一个&
        Object object2 = annotationConfigApplicationContext.getBean("&myFactoryBean");
        System.out.println(object2.getClass());


    }
}
