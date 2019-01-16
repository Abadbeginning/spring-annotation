package com.example.conditional;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MySelectImport implements ImportSelector {

    // 返回值就是容器中的组件的全类名
    // annotationMetadata 当前标注@import注解的类的所有信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.example.vo.CoCo","com.example.vo.Milk"};
    }

}
