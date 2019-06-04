package com.kodilla;

public class Calculator {
    public void sum(){
        System.out.println("this is sum");
    }
    public void difference(){
        System.out.println("this is difference");
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.difference();
    }
}
