package com.example.config;

import com.example.conditional.MyDefineImport;
import com.example.conditional.MySelectImport;
import com.example.vo.Chicken;
import com.example.vo.Duck;
import com.example.vo.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// @ComponentScan(value = "com.example")
@Import({Person.class, Duck.class, Chicken.class, MySelectImport.class, MyDefineImport.class})
public class TestImportConfig {

}
