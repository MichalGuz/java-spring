package com.spring.basic.start.practice_boards;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testAddTask() {
        board.getDoneList().getTasks().add("Task 1");
        Assert.assertEquals(1, board.getDoneList().getTasks().size());
    }

    @Test
    public void testOfExistingBeans() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        // when
        String bean1 = (String)context.getBean("taskListToDo");
        boolean beanOne = context.containsBean("taskListToDo");
        String bean2 = (String)context.getBean("taskListInProgress");
        boolean beanTwo = context.containsBean("taskListInProgress");
        String bean3 = (String)context.getBean("taskListDone");
        boolean beanThree = context.containsBean("taskListDone");

    }
}
