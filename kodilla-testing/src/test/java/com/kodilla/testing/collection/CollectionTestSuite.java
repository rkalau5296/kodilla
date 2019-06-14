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
    private void checkIfIsOddElements(OddNumbersExterminator oddNumbersExterminator ){
        ArrayList<Integer> evenNumberList = oddNumbersExterminator.exterminate(numbers);
        for (int i = 0; i<evenNumberList.size(); i++){
            if (evenNumberList.get(i)%2!=0){
                System.out.println("Error. The list contains odd elements");
                return;
            }
        }
        System.out.println("Everything is OK. There is no odd elements.");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList (){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        numbers = null;
        oddNumbersExterminator.exterminate(numbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        checkIfIsOddElements(oddNumbersExterminator);
    }
}
