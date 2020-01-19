package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorsQueuesTestSuite {
    @Test
    public void testUpdateMentorsQueues(){
        //Given
        TaskQueue rafalsQueue = new RafalQueue();
        TaskQueue piotrsQueue = new PiotrQueue();
        TaskQueue pawelsQueue = new PawelQueue();
        TaskQueue damiansQueue = new DamianQueue();
        TaskQueue annasQueue = new AnnaQueue();
        TaskQueue margaretsQueue = new MargaretQueue();

        Mentor karol = new Mentor("Karol");
        Mentor andrzej = new Mentor("Andrzej");

        rafalsQueue.registerObserver(karol);
        piotrsQueue.registerObserver(karol);
        pawelsQueue.registerObserver(andrzej);
        damiansQueue.registerObserver(andrzej);
        annasQueue.registerObserver(andrzej);
        margaretsQueue.registerObserver(andrzej);

        //When
        rafalsQueue.sendTask("Task");
        rafalsQueue.sendTask("Task");
        rafalsQueue.sendTask("Task");
        piotrsQueue.sendTask("Task");
        piotrsQueue.sendTask("Task");
        pawelsQueue.sendTask("Task");
        annasQueue.sendTask("Task");
        annasQueue.sendTask("Task");
        annasQueue.sendTask("Task");
        annasQueue.sendTask("Task");
        damiansQueue.sendTask("Task");
        margaretsQueue.sendTask("Task");

        //Then
        assertEquals(5, karol.getUpdateCount());
        assertEquals(7, andrzej.getUpdateCount());
    }
}
