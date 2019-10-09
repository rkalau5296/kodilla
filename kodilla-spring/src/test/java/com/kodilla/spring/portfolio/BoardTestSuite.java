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
        toDoList.getToDoList().getTasks().add("shopping");
        Board inProgressList = context.getBean(Board.class);
        inProgressList.getInProgressList().getTasks().add("Cleaning");
        Board doneList = context.getBean(Board.class);
        doneList.getDoneList().getTasks().add("Cooking");
        //Then
        System.out.println(toDoList);
        System.out.println(inProgressList);
        System.out.println(doneList);
        }
}
