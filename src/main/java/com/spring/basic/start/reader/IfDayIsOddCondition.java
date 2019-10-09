package com.spring.basic.start.reader;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IfDayIsOddCondition implements Condition {
    @Override
    public boolean mathches(ConditionContext context, AnnotatedTypeMetadata metadata) {

    }
}
