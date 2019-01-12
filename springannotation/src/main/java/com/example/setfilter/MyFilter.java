package com.example.setfilter;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import org.springframework.core.io.Resource;
import java.io.IOException;

/*
*  自定义过滤
* */
public class MyFilter implements TypeFilter {
    /* true ---> 匹配成功 false ---> 匹配失败. */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();

        // 打印com.example下的类名
        String name = classMetadata.getClassName();
        System.err.println("className--------->" + name);

        // 类名模糊匹配ser
        if(name.contains("ser")){
            return true;
        }

        return false;
    }
}
