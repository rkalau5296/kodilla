package codillity;

import java.util.*;

class Solution {

    public static int consecutiveZeros(int n) {

        int max = Integer.numberOfLeadingZeros(0);
        int consecutive = 0;
        int currentCount = 0;
        while (Integer.numberOfLeadingZeros(n) != max) {
            if ((n & 1) == 0) {
                currentCount++;
            } else {
                if (currentCount > consecutive) {
                    consecutive = currentCount;
                }
                currentCount = 0;
            }
            n = n >> 1;
        }
        return consecutive;
    }

    public static List<Character> solution(int N) {
        String stringResult = Integer.toBinaryString(N);
        List<Character> characterList = new ArrayList<>();
        for(char element: stringResult.toCharArray()) {
            characterList.add(element);
        }
        return characterList;
    }


    public static void main(String[] args) {
        int i = 88;
        System.out.println(Integer.toBinaryString(i));

        int count = consecutiveZeros(i);
        System.out.println("Consecutive zeros: " + count);

    }
}