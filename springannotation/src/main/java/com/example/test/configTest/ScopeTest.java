package com.example.test.configTest;

import com.example.config.TestScopeConfig;
import com.example.vo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ScopeTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestScopeConfig.class);

    @Test
    public void test(){

        System.out.println("创建over");
        Person a = applicationContext.getBean(Person.class);
        Person b = applicationContext.getBean(Person.class);
//        System.out.println(a == b);

    }

    @Test
    public void test1(){
      String property = applicationContext.getEnvironment().getProperty("os.name");
      System.out.println(property);
    }


}
