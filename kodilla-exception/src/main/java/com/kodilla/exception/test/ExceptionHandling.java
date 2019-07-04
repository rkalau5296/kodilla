package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3,1.5);
        }
        catch (Exception a){
            System.out.println("Illegal parameters " + a);
        }
        finally {
            System.out.println("Do what you can.");
        }
    }

}
