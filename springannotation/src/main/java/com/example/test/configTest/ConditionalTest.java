package com.example.test.configTest;

import com.example.config.TestContditional;
import com.example.vo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionalTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestContditional.class);

    @Test
    public void test(){

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names){
            System.out.println("type------>" + name);
        }

        Map<String, Person> map = applicationContext.getBeansOfType(Person.class);
        System.out.println(map);

        String property = applicationContext.getEnvironment().getProperty("os.name");
        System.out.println(property);
    }

}
