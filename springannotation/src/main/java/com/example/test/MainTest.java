package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybeans.xml");
    applicationContext.get("person");


}
