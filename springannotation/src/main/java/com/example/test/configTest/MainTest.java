package com.example.test.configTest;

import com.example.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybeans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.err.println(person);

    }

}
