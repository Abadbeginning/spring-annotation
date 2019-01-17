package com.example.conditional;

import com.example.vo.Sun;
import org.springframework.beans.factory.FactoryBean;

// 创建一个spring定义的FactoryBean
public class MyFactoryBean implements FactoryBean<Sun> {

    // 返回这个bean对象 这个对象会添加到容器中
    public Sun getObject() throws Exception {
        System.out.println("sun beanfactory。。。。getObject()。。。。。");
        return new Sun();
    }

    public Class<?> getObjectType() {
        return Sun.class;
    }

    // 是否是单例  true -> 单例
    // false多实例 每次获取都会创建一个新bean
    public boolean isSingleton() {
        return false;
    }
}
