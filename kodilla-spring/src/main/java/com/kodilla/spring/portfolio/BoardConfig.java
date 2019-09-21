package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("board1")
    Board board;

    @Bean
    public TaskList getTaskList() {
        return new TaskList();
    }

    @Bean(name = "board1")
    @Scope("prototype")
    public Board getBoardOne() {
        return new Board();
    }

    @Bean(name = "board2")
    @Scope("prototype")
    public Board getBoardTwo() {
        return new Board();
    }

    @Bean(name = "board3")
    @Scope("prototype")
    public Board getBoardThree() {
        return new Board();
    }
}
