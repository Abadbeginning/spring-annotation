package com.example.config;

import com.example.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestScopeConfig {
    /*
        接口ConfigurableBeanFactory
    *   String SCOPE_SINGLETON = "singleton";
    *   String SCOPE_PROTOTYPE = "prototype";
    * */
   @Scope("prototype")
//    @Scope
    @Bean(name = "person")
    public Person person(){
        System.out.println("容器添加一个person、、、");
        return new Person("剑来", 18);
    }

}
