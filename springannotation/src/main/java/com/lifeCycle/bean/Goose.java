package com.lifeCycle.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Goose {

    public Goose() {
        System.out.println("goose constructor....");
    }

    // 在bean创建完成并赋值 容器执行初始化
    @PostConstruct
    public void init(){
        System.out.println("goose @PostConstruct....");
    }

    // 在容器销毁bean之前 进行方法的清理工作
    @PreDestroy
    public void destory(){
        System.out.println("goose @PreDestroy....");
    }



}
