package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {3,5,1,2,4,6,7,8,3,9};

        //When
        double average = ArrayOperations.getAverage(numbers);
        
        //Then
        Assert.assertEquals(4.8,  average, 0.0);
    }
}
