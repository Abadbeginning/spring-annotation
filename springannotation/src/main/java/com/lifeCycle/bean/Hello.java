package com.lifeCycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class Hello implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ioc传入:" + applicationContext);
    }

    public void setBeanName(String s) {
        System.out.println("beanName: " + s);
    }

    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        stringValueResolver.resolveStringValue("话的${os.name},为难我#{23+25}");
        System.out.println("解析:" + stringValueResolver);
    }
}
