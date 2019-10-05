package com.spring.basic.start;

import com.spring.basic.start.shape.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

	@Test
	public void testCircleLoadedIntoContainer(){
		// given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
		Shape shape = context.getBean(Circle.class);

		// when
		String name = shape.getShapeName();

		// then
        System.out.println("String name = " + name);
		Assert.assertEquals("This is a circle.", name);
	}

	@Test
	public void testTriangleLoadedIntoContainer(){
		// given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
		Shape shape = context.getBean(Triangle.class);

		// when
		String name = shape.getShapeName();

		// then
        System.out.println("String name = " + name);
		Assert.assertEquals("This is a triangle.", name);
	}

	@Test
    public void testSquareLoadedIntoContainer(){
	    // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
        Shape shape = context.getBean(Square.class);

        // when
        String name = shape.getShapeName();

        // then
        System.out.println("String name = " + name);
        Assert.assertEquals("This is a square.", name);
    }

    @Test
	public void testRectangleLoadedIntoContainer(){
		// given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
		Shape shape = context.getBean(Rectangle.class);

		// when
		String name = shape.getShapeName();
	}
}
