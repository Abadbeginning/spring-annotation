package com.example.config;

import com.example.conditional.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestFactoryBean{

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }


}
