package com.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class WindowConditional implements Condition {

    /*
    *
    *   conditionContext 获取上下文
    *   annotatedTypeMetadata 获取信息
    * */
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");
        if (property.contains("Win")){
            return true;
        }
        return false;
    }
}
