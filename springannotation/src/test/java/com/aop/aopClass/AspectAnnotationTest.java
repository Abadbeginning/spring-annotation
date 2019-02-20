package com.aop.aopClass;


import com.aop.config.MainAopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectAnnotationTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainAopConfig.class);


        TestDivMethod testDivMethod = annotationConfigApplicationContext.getBean(TestDivMethod.class);
        testDivMethod.divResult(2,1);

        annotationConfigApplicationContext.close();

    }

}
