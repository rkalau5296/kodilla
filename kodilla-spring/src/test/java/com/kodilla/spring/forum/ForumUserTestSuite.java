package com.kodilla.spring.forum;

import com.kodilla.spring.shape.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        context.getBean(ForumUser.class);
        ForumUser forumUser = new ForumUser();
        //When
        String name = forumUser.username;
        //Then
        Assert.assertEquals("John Smith", name);
    }
}
