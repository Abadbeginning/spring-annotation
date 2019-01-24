package com.lifeCycle.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@Component
//@ToString
public class PersonValue {

    // @Value()的使用
        //  1、 基本数值
        //  2、 可以写SPEL: #{}
        //  3、${} 取出配置文件的值 在运行环境变量里的值

    @Value("#{259-89}")
    private Integer id;

    @Value("先锋")
    private String userName;


}
