package com.kodilla.hibernate.taskList.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test TaskList: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "ListName 1");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }
    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "ListName 1");
        taskListDao.save(taskList);

        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
