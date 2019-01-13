package com.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxConditional implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String property = conditionContext.getEnvironment().getProperty("os.name");
        if (property.contains("lin")){
            return true;
        }
        return false;
    }
}
