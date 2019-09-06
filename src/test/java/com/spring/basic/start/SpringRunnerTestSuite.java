package com.spring.basic.start;

import com.spring.basic.start.shape.Circle;
import com.spring.basic.start.shape.Shape;
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
	}

}
