package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        if (numbers == null) {
            System.out.println("the list is empty");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    oddNumbers.add(numbers.get(i));
                }
            }

        }
        return oddNumbers;
    }
}
