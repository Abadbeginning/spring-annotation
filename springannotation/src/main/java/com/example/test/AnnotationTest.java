package com.example.test;

import com.example.config.PersonConfig;
import com.example.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person) applicationContext.getBean(Person.class);
        System.err.println(person);

        String[] strings = applicationContext.getBeanNamesForType(Person.class);
        if(strings.length <= 0 || strings == null){
            System.err.println("啥都没有!!!");
            return;
        }
        for(String s : strings){
            System.err.println(s);
        }

    }

}
