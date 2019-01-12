package com.example.config;

import com.example.vo.Person;
import org.springframework.context.annotation.*;

@Configuration
public class TestScopeConfig {
    /*
        接口ConfigurableBeanFactory
    *   String SCOPE_SINGLETON = "singleton";
    *   String SCOPE_PROTOTYPE = "prototype";
    * */
//   @Scope("prototype")
    @Scope
    @Lazy
    @Bean(name = "person")
    public Person person(){
        System.out.println("容器添加一个person、、、");
        return new Person("剑来", 18);
    }

}
