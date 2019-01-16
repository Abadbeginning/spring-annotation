package com.example.conditional;

import com.example.vo.Sun;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyDefineImport implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean duck = beanDefinitionRegistry.containsBeanDefinition("com.example.vo.Duck");
        boolean coco = beanDefinitionRegistry.containsBeanDefinition("com.example.vo.CoCo");
        if(duck && coco){
            System.out.println("成功");
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Sun.class);
            beanDefinitionRegistry.registerBeanDefinition("Sun", rootBeanDefinition);
        }

    }
}
