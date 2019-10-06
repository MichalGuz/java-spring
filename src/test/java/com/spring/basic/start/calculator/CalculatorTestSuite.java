package com.spring.basic.start.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start.calculator");
        Display display = context.getBean(Display.class);

        // when
        double a = 3.0;
        double b = 2.0;
        Calculator calculator = new Calculator();
        calculator.add(a, b);

    }
}
