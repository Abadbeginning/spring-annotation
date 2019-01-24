package com.lifeCycle.config;


import com.lifeCycle.bean.PersonValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigValueTest {

    @Test
    public void test(){
        // 测试@Value
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigValue.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name : names)
            System.out.println("names: " + name);

        System.out.println("--------------------------------->");

        Object o = annotationConfigApplicationContext.getBean(PersonValue.class);
        System.out.println(o);


    }
}
