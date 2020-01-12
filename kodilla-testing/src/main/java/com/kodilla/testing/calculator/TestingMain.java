package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(3, 5);
        int resultSubstract = calculator.subtract(10, 5);

        if ((resultAdd == 8) && (resultSubstract == 5)) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}
