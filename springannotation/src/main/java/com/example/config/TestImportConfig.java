package com.example.config;

import com.example.vo.Chicken;
import com.example.vo.Duck;
import com.example.vo.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// @ComponentScan(value = "com.example")
@Import({Person.class, Duck.class, Chicken.class})
public class TestImportConfig {

}
