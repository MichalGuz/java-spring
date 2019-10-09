package com.spring.basic.start.practice_boards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean(name = "taskListToDo")
    public TaskList getTaskListToDo() {
        return new TaskList();
    }

    @Bean(name = "taskListInProgress")
    public TaskList getTaskListInProgress() {
        return new TaskList();
    }
}
