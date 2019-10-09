package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;
    @Autowired
    TaskList inProgressList;
    @Autowired
    TaskList doneList;

    @Bean
    public Board getTaskList() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")

    public TaskList getToDoList() { return new TaskList(); }

    @Bean(name = "inProgressList")

    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")

    public TaskList getDoneList() {
        return new TaskList();
    }
}
