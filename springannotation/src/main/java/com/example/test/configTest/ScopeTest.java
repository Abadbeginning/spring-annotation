package com.example.test.configTest;

import com.example.config.TestScopeConfig;
import com.example.vo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ScopeTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestScopeConfig.class);

        System.out.println("创建over");
        Person a = applicationContext.getBean(Person.class);
        Person b = applicationContext.getBean(Person.class);
        System.out.println(a == b);
    }


}
