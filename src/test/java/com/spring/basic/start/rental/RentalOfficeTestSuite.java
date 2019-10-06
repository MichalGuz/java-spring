package com.spring.basic.start.rental;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RentalOfficeTestSuite {

    @Test
    public void testLoadDataFromDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.rental");
        RentalOffice rentalOffice = context.getBean(RentalOffice.class);

        // when
        rentalOffice.loadDataFromDb();

        // then
        // do nothing
    }

    @Test
    public void testSaveDataToDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.rental");
        RentalOffice rentalOffice = context.getBean(RentalOffice.class);

        // when
        rentalOffice.saveDataToDb();

        // then
        // do nothing
    }
}
