package com.example.config;

import com.example.controller.UserController;
import com.example.setfilter.MyFilter;
import com.example.vo.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Configuration // 告诉spring这是一个配置类
/*@ComponentScans(value = {
            @ComponentScan(value = "com.example",useDefaultFilters=false,
                includeFilters =
                  {
//                          @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class}),
                          // 专门定义一个类
                          @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = UserController.class)

                  })*//*,
            @ComponentScan(value = "com.example", useDefaultFilters = false,
                    excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)}
            )*//*
        }
)*/
@ComponentScan(value = "com.example",useDefaultFilters=false,
                    includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyFilter.class)}
)
public class PersonConfig {

    @Bean(name = "person")
    public Person person2(){
        System.out.println("容器添加person。。。");
        return new Person("小鸟",32);
    }

}
