package com.spring.basic.start.calculator;


import org.junit.Assert;
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
        Calculator calculator = new Calculator(display);
        double addResult = calculator.add(a, b);
        double subResult = calculator.sub(a, b);
        double mulResult = calculator.mul(a, b);
        double divResult = calculator.div(a, b);

        // then
        Assert.assertEquals(5.0, addResult, 0.01);
        Assert.assertEquals(1.0, subResult, 0.01);
        Assert.assertEquals(6.0, mulResult, 0.01);
        Assert.assertEquals(1.5, divResult,0.01);
    }
}
