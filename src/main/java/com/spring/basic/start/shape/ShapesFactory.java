package com.spring.basic.start.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare(){
        return new Square();
    }

    @Bean
    public Rectangle createRectangle(){
        return new Rectangle();
    }

    public Shape choosenShape() {
        Shape theShape;
        return theShape;
    }
}
