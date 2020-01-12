package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.factory.tasks.TaskFactory.*;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(DRIVING_TASK);
        //Then
        Assert.assertEquals("Travel is done", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Travel", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting is done", paintingTask.executeTask());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("PaintingPicture", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping is done", shoppingTask.executeTask());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Supermarket", shoppingTask.getTaskName());
    }
}
