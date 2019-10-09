package com.spring.basic.start.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    public void testRead(){
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        // when & then
        reader.read();
    }

    @Test
    public void testConditional() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(Reader.class);

        // when
        boolean book2Exist = context.containsBean("book2");

        // then
        System.out.println("Bean book2 was found in the container: " + book2Exist);
    }
}
