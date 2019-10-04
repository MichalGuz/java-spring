package com.spring.basic.start.shape;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{
    @Override
    public String getShapeName(){
        return "This is square.";
    }
}
