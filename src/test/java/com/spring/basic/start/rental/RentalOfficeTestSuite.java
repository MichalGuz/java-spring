package com.spring.basic.start.rental;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RentalOfficeTestSuite {
    @Test
    public void testLoadDataFromDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
        RentalOffice rentalOffice = (RentalOffice)context.getBean("rentalOfficeConfig");

        // when
        rentalOffice.loadDataFromDb();

        // then
        // nothing
    }

    @Test
    public void testSaveDataToDb() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
        RentalOffice rentalOffice = (RentalOffice)context.getBean("rentalOfficeConfig");

        // when
        rentalOffice.saveDataToDb();

        // then
        // nothing
    }

    @Test
    public void testContex() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(RentalOfficeConfiguration.class);

        // when & then
        System.out.println("======= Beans list =======");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("===========================");
    }

    @Test
    public void testWiderContex() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring");

        // when & then
        System.out.println("======= Beans list =======");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("===========================");
    }
}
