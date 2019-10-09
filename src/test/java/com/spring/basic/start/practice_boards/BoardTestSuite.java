package com.spring.basic.start.practice_boards;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
}
