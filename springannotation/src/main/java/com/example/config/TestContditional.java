package com.example.config;

import com.example.conditional.LinuxConditional;
import com.example.conditional.WindowConditional;
import com.example.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

// @Conditional(xxx)全局必须都得match才行
@Configuration
public class TestContditional {
    @Conditional(WindowConditional.class)
    @Bean(name = "fengnianWin")
    public Person person(){
        //System.out.println("容器添加一个person、、、");
        return new Person("徐凤年", 18);
    }

    // 获取系统的名字是否与bean名模糊相配 -Dos.name=linux
    @Conditional(LinuxConditional.class)
    @Bean(name = "tulin")
    public Person person1(){
        //System.out.println("容器添加一个person、、、");
        return new Person("徐屠", 48);
    }

}
