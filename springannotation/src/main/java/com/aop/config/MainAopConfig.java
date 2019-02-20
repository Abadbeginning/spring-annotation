package com.aop.config;

import com.aop.aopClass.AspectAnnotation;
import com.aop.aopClass.TestDivMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/*
*   使用aop切面三步走:
*       1.分逻辑实现类 和 切面类 如何区分呢(@Aspect)
*       2.切入点表达式 注解
*       3.开启基于注解的模式(@EnableAspectJAutoProxy)
*
*   总结:
*        前置通知:
*        后置通知:
*        返回通知:
*        异常通知:
*        环绕通知:
*
*
* */
// 配置逻辑实现类的bean
// 配置切面类
@EnableAspectJAutoProxy
@Configuration
@Import({TestDivMethod.class, AspectAnnotation.class})
public class MainAopConfig {

}
