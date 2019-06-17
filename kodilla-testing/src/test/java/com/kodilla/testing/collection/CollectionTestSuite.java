package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    ArrayList<Integer> numbers;

    @Before
    public void before(){
        numbers = new ArrayList<>();
        for (int i=0; i<20; i++){
            numbers.add(i);
        }
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        oddNumbersExterminator.exterminate(numbers1);
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers1);
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorEvenList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.exterminate(numbers).get(1);
        System.out.println("testing " + result);
        //Then
        Assert.assertEquals(2,  result);
    }
    @Test
    public void testOddNumbersExterminatorOddList (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        int result = oddNumbersExterminator.exterminate(numbers).get(1);
        System.out.println("testing " + result);
        //Then
        Assert.assertNotEquals(3,  result);
    }
}
