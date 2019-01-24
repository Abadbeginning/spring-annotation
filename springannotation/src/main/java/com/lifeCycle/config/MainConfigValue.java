package com.lifeCycle.config;

import com.lifeCycle.bean.PersonValue;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(value = "com.lifeCycle.bean")
@Import(PersonValue.class)
public class MainConfigValue {

}
