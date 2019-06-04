package com.kodilla;

public class Calculator {
    public void sum(){
        System.out.println("this is sum");
    }
    public void difference(){
        System.out.println("this is difference");
    }

    public static void main(String[] args){
        int a = 186;
        int b = 56;
        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("NWD = " + a);
    }
}
