package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = " This is a very beautiful text. ";
        poemBeautifier.beautify("AAA", (a)->a + text + a);
        poemBeautifier.beautify("AAA", (a)->text.toUpperCase());
        poemBeautifier.beautify("AAA", (a)->text.toLowerCase());
        poemBeautifier.beautify("AAA", (a)->"<<<<<"+text+">>>>>");
        poemBeautifier.beautify("AAA", (a)->"****"+text+"****");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
