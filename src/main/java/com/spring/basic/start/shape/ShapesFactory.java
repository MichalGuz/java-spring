package com.spring.basic.start.shape;

import org.springframework.context.annotation.Bean;

public class ShapesFactory {
    @Bean
    public Square createSquare(){
        return new Square();
    }
}
