package com.aop.aopClass;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

// @Aspect代表这是一个切点类
@Aspect
public class AspectAnnotation {

    @Pointcut("execution(public int com.aop.aopClass.TestDivMethod.*(..))")
    public void pointSur(){}

    // 前置通知 在目标方法运行之前
    @Before("pointSur()")
    public void before(JoinPoint joinPoint){
        System.out.println("@Before通知为: " + joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());
        System.out.println("@Before参数为: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@Before被织入的目标对象为: " + joinPoint.getTarget());

    }

    // 后置通知 在目标方法运行之后
    @After("pointSur()")
    public void after(JoinPoint joinPoint){

        System.out.println("@After通知为: " + joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());
        System.out.println("@After参数为: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@After被织入的目标对象为: " + joinPoint.getTarget());

    }

    // 返回通知

    @AfterReturning(value = "pointSur()", returning="returnResult")
    public void afterReturning(Object returnResult){

       /* System.out.println("@AfterReturning通知为: " + joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());
        System.out.println("@AfterReturning参数为: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@AfterReturning被织入的目标对象为: " + joinPoint.getTarget());*/
        System.out.println("@AfterReturning通知结果为: { "+ returnResult +" }");

    }

    @AfterThrowing(value = "pointSur()", throwing = "exceotion")
    public void afterThrowing(Exception exceotion){

       /* System.out.println("@AfterReturning通知为: " + joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());
        System.out.println("@AfterReturning参数为: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@AfterReturning被织入的目标对象为: " + joinPoint.getTarget());*/
        System.out.println("@AfterThrowing通知为: { "+ exceotion +" }");
    }

    @Around("pointSur()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{

/*        System.out.println("@Around通知为: " + joinPoint.getSignature().getDeclaringTypeName() + "."+joinPoint.getSignature().getName());
        System.out.println("@Around参数为: " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("@Around被织入的目标对象为: " + joinPoint.getTarget());*/
        System.out.println("我是环绕通知前。。。");

        // 执行目标函数
        Object object = joinPoint.proceed();
        System.out.println("我是环绕通知后。。。");

        return object;
    }



}
