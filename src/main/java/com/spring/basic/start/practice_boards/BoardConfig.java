package com.spring.basic.start.practice_boards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean(name = "taskListToDo")
    @Scope("prototype")
    public TaskList getTaskListToDo() {
        return new TaskList();
    }

    @Bean(name = "taskListInProgress")
    @Scope("prototype")
    public TaskList getTaskListInProgress() {
        return new TaskList();
    }

    @Bean(name = "taskListDone")
    @Scope("prototype")
    public TaskList getTaskListDone() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("taskListToDo")
    private TaskList toDoList;

    @Autowired
    @Qualifier("taskListInProgress")
    private TaskList inProgress;

    @Autowired
    @Qualifier("taskListDone")
    private TaskList done;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgress, done);
    }
}
