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
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers);

    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers);

    }
}
