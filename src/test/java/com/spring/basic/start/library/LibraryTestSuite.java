package com.spring.basic.start.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Test
    public void testLoadFromDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.library");
        Library library = context.getBean(Library.class);

        // when
        library.loadFromDb();

        // then
        // do nothing
    }

    @Test
    public void testSaveToDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.library");
        Library library = context.getBean(Library.class);

        // when
        library.saveToDb();

        // then
        // do nothing
    }
}
