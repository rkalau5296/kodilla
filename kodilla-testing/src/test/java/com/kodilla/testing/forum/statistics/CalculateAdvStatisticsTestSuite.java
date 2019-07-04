package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    @Test
    public void testListOfUsersSize(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Piotr Kowalski");
        usersList.add("Adam Kwiatkowski");
        usersList.add("Jan Nowak");
        usersList.add("Andrzej Piotrowski");
        usersList.add("Robert Lewandowski");
        usersList.add("Piotr Piatek");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(6, calculateStatistics.getQuantityOfUsers());
    }

//    @Test
//    public void testStatisticZeroPosts(){
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<String> usersList = new ArrayList<>();
//        usersList.add("Piotr Kowalski");
//        usersList.add("Adam Kwiatkowski");
//        usersList.add("Jan Nowak");
//        usersList.add("Andrzej Piotrowski");
//        usersList.add("Robert Lewandowski");
//        usersList.add("Piotr Piatek");
//
//        when(statisticsMock.usersNames()).thenReturn(usersList);
//        when(statisticsMock.postsCount()).thenReturn(0);
//        when(statisticsMock.commentsCount()).thenReturn(20);
//
//        //When
//        CalculateStatistics calculateStatistics = new CalculateStatistics();
//        calculateStatistics.calculateAdvStatistics(statisticsMock);
//
//        //Then
//        Assert.assertEquals(6, calculateStatistics.getQuantityOfUsers());
//        Assert.assertEquals(1000, calculateStatistics.getQuantityOfPosts());
//        Assert.assertEquals(20, calculateStatistics.getQuantityOfComments());
//        Assert.assertEquals(3,calculateStatistics.getAvgQuantityOfCommentsPerUser());
//        Assert.assertEquals(166,calculateStatistics.getAvgQuantityOfPostsPerUser());
//        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerPost());
//
//    }
    @Test
    public void testStatisticThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Piotr Kowalski");
        usersList.add("Adam Kwiatkowski");
        usersList.add("Jan Nowak");
        usersList.add("Andrzej Piotrowski");
        usersList.add("Robert Lewandowski");
        usersList.add("Piotr Piatek");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(6, calculateStatistics.getQuantityOfUsers());
        Assert.assertEquals(1000, calculateStatistics.getQuantityOfPosts());
        Assert.assertEquals(20, calculateStatistics.getQuantityOfComments());
        Assert.assertEquals(3,calculateStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(166,calculateStatistics.getAvgQuantityOfPostsPerUser());
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerPost());

    }
    @Test
    public void testStatisticZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Piotr Kowalski");
        usersList.add("Adam Kwiatkowski");
        usersList.add("Jan Nowak");
        usersList.add("Andrzej Piotrowski");
        usersList.add("Robert Lewandowski");
        usersList.add("Piotr Piatek");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(1,calculateStatistics.getAvgQuantityOfPostsPerUser());
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerPost());

    }
    @Test
    public void testStatisticQuantityCommentsLessThenQuantityPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Piotr Kowalski");
        usersList.add("Adam Kwiatkowski");
        usersList.add("Jan Nowak");
        usersList.add("Andrzej Piotrowski");
        usersList.add("Robert Lewandowski");
        usersList.add("Piotr Piatek");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(2);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(1,calculateStatistics.getAvgQuantityOfPostsPerUser());
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerPost());

    }
    @Test
    public void testStatisticQuantityCommentsGreaterThenQuantityPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        usersList.add("Piotr Kowalski");
        usersList.add("Adam Kwiatkowski");
        usersList.add("Jan Nowak");
        usersList.add("Andrzej Piotrowski");
        usersList.add("Robert Lewandowski");
        usersList.add("Piotr Piatek");

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(3,calculateStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(1,calculateStatistics.getAvgQuantityOfPostsPerUser());
        Assert.assertEquals(2,calculateStatistics.getAvgQuantityOfCommentsPerPost());

    }
//    @Test
//    public void testStatisticZeroUsers(){
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<String> usersList = new ArrayList<>();
////        usersList.add("Piotr Kowalski");
////        usersList.add("Adam Kwiatkowski");
////        usersList.add("Jan Nowak");
////        usersList.add("Andrzej Piotrowski");
////        usersList.add("Robert Lewandowski");
////        usersList.add("Piotr Piatek");
//
//        when(statisticsMock.usersNames()).thenReturn(usersList);
//        when(statisticsMock.postsCount()).thenReturn(10);
//        when(statisticsMock.commentsCount()).thenReturn(20);
//
//        //When
//        CalculateStatistics calculateStatistics = new CalculateStatistics();
//        calculateStatistics.calculateAdvStatistics(statisticsMock);
//
//        //Then
//        Assert.assertEquals(3,calculateStatistics.getAvgQuantityOfCommentsPerUser());
//        Assert.assertEquals(1,calculateStatistics.getAvgQuantityOfPostsPerUser());
//        Assert.assertEquals(2,calculateStatistics.getAvgQuantityOfCommentsPerPost());
//
//    }
    @Test
    public void testStatisticOneHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<100; i++)
            usersList.add(i, ""+i);


        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfCommentsPerUser());
        Assert.assertEquals(0,calculateStatistics.getAvgQuantityOfPostsPerUser());
        Assert.assertEquals(2,calculateStatistics.getAvgQuantityOfCommentsPerPost());

    }
}
