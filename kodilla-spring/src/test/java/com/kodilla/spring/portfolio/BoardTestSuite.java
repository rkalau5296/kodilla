package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board toDoList = context.getBean(Board.class);
        toDoList.toDoList.getTasks().add("Shopping");
        Board inProgressList = context.getBean(Board.class);
        inProgressList.inProgressList.getTasks().add("Cleaning");
//        Board doneList = context.getBean(Board.class);
//        doneList.doneList.getTasks().add("Cooking");
        //Then
        System.out.println(toDoList);
        }
}
