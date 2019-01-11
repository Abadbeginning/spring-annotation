package com.example.config;

import com.example.vo.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Configuration // 告诉spring这是一个配置类
@ComponentScans(value = {
            @ComponentScan(value = "com.example",useDefaultFilters=false,
                includeFilters =
                  {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})

                  }),
            @ComponentScan(value = "com.example", useDefaultFilters = false,
                    excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)}
            )
        }
)
public class PersonConfig {

    @Bean(name = "person")
    public Person person2(){
        return new Person("小鸟",32);
    }

}
