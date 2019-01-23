package com.lifeCycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyFeet implements InitializingBean, DisposableBean {
    public MyFeet() {
        System.out.println("myfeet 好好好。。。。。");
    }

    public void destroy() throws Exception {
        System.out.println("收尾。。。");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("神来之笔。。。。");
    }
}
