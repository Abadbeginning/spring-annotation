package com.example.test.configTest;

import com.example.config.TestImportConfig;
import com.example.config.TestScopeConfig;
import com.example.vo.Milk;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 测试@Import
public class TestImport {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestImportConfig.class);

    @Test
    public void test(){
        importMethod(annotationConfigApplicationContext);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        Milk milk = annotationConfigApplicationContext.getBean(Milk.class);
        System.err.println("milk:" + milk);
    }

    private void importMethod(AnnotationConfigApplicationContext annotationConfigApplicationContext){
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.err.println(name);
        }
    }
}
