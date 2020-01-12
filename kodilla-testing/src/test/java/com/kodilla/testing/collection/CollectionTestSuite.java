package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    ArrayList<Integer> numbers;

    @Before
    public void before() {
        numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {
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
    public void testOddNumbersExterminatorEvenList() {
        //Given
        ArrayList<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (numbers.get(i) % 2 == 0) {
                expectedList.add(numbers.get(i));
            }
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertEquals(expectedList, result);
        Assert.assertEquals(expectedList.size(), result.size());
    }

    @Test
    public void testOddNumbersExterminatorOddList() {
        //Given
        ArrayList<Integer> expectedList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (!(numbers.get(i) % 2 == 0)) {
                expectedList.add(numbers.get(i));
            }
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertNotEquals(expectedList, result);
    }
}
