package com.example.config;

import com.example.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean(name = "person")
    public Person person2(){
        return new Person("小鸟",32);
    }

}
