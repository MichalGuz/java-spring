package com.spring.basic.start.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

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
        Random generator = new Random();
        int choosen = generator.nextInt(4);
        return theShape;
    }
}
