package com.spring.basic.start.practice_boards;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String[] names = context.getBeanDefinitionNames();
        TaskList bean1 = (TaskList)context.getBean("taskListToDo");
        boolean beanOne = context.containsBean("taskListToDo");
        TaskList bean2 = (TaskList) context.getBean("taskListInProgress");
        boolean beanTwo = context.containsBean("taskListInProgress");
        TaskList bean3 = (TaskList) context.getBean("taskListDone");
        boolean beanThree = context.containsBean("taskListDone");

        // then
        System.out.println("List of beans (BoardConfig class):");
        Arrays.stream(names)
                .forEach(System.out::println);
        System.out.println("\nThere is a bean in the container: " + bean1 + ". The name of this bean is \"taskListToDo\". Am I right?\n" + beanOne);
        System.out.println("\nThere is a bean in the container:" + bean2 + ". The name of this bean is \"taskListInProgress\". Am I right?\n" + beanTwo);
        System.out.println("\nThere is a bean in the container:" + bean1 + ". The name of this bean is \"taskListDone\". Am I right?\n" + beanThree);
    }

    @Test
    public void testTasksAddToLists() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.basic.start");
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("task 1");
        board.getInProgressList().getTasks().add("task 2");
        board.getDoneList().getTasks().add("task 3");

        // when
        TaskList toDoList = board.getToDoList();
        List<String> list1 = toDoList.getTasks();
        TaskList inProgress = board.getInProgressList();
        List<String> list2 = inProgress.getTasks();
        TaskList doneList = board.getDoneList();
        List<String> list3 = doneList.getTasks();

        // then
        System.out.println(list1.get(0) + "\n" + list2.get(0) + "\n" + list3.get(0));
    }
}
