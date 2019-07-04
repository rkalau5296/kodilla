package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        FileReaderException fileReaderException = new FileReaderException();
        try {
            fileReaderException.probablyIWillThrowException(3,1.5);
        }
        catch (Exception a){
            System.out.println("WTF? " + a);
        }
        finally {
            System.out.println("Get out of here!");
        }
    }

}
