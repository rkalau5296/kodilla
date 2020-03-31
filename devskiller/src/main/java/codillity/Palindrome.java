package codillity;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palindrome {

//    public static String solution(int N, int K) {
//        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
//        char[] palindrom = new char[N];
//        char[] palindromLetters = new char[K];
//        Random random = new Random();
//        int randomIndex = 0;
//        for (int i = 0; i < palindromLetters.length; i++) {
//            randomIndex = random.nextInt(alphabet.length);
//            palindromLetters[i] = alphabet[randomIndex];
//            alphabet = deleteElement(alphabet, randomIndex);
//        }
//
//        int randomIndexPalindromLetters = 0;
//
//        for (int i = 0; i < palindromLetters.length; i++) {
//            randomIndexPalindromLetters = random.nextInt(palindromLetters.length);
//            palindrom[i] = palindromLetters[randomIndex];
//            palindrom[N-i] = palindrom[i];
//            palindromLetters = deleteElement(palindromLetters, randomIndex);
//        }
//
//
//
//
//            return Arrays.toString(palindrom);
//    }
    public static char[] DNA(int n, char[] alphabet) {
        Random random= new Random();
        char [] base= new char[n];
        for(int i=0; i<n; i++) {
            int m = random.nextInt(alphabet.length);
            base[i]= alphabet[m];
        }
        return base;
    }
    public static char[] deleteElement(char[] alphabet, int randomIndex ) {
        char [] newAlphabet = new char[alphabet.length-1];
        for(int i=0, k=0; i<alphabet.length; i++) {
            if(i==randomIndex)
            {
                continue;
            }
            newAlphabet[k] = alphabet[i];
            k++;
        }
        return newAlphabet;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj 1 wyraz: ");
//        String a = sc.nextLine();
//        int h = a.length();
//
//        int kk = 0;
//        int k = (h - 1);
//        for (int i = 0; i < h; i++) {
//
//            if (a.charAt(i) != a.charAt(k)) {
//                kk = 1;
//                break;
//            }
//            k--;
//        }
//
//        if (kk == 1)
//            System.out.println("Nie jest palindromem");
//        else {
//            System.out.println("Jest palindromem");
//        }
//        char[] alphabet = {'a','b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
//        System.out.println(deleteElement(alphabet,5));
        //System.out.println(deleteElement(alphabet,5)[0]);

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','w','x','y','z'};
        char[] palindrom = new char[5];
        char[] palindromLetters = new char[3];
        Random random = new Random();
        int randomIndex = 0;
        //losujemy trzy różne litery alfabetu i chowamy je do char[] palindromLetters;
        for (int i = 0; i < palindromLetters.length; i++) {
            randomIndex = random.nextInt(alphabet.length);
            palindromLetters[i] = alphabet[randomIndex];
            alphabet = deleteElement(alphabet, randomIndex);
        }
        System.out.println("Wylosowane litery to: " + Arrays.toString(palindromLetters));

        int randomIndexPalindromLetters = 0;

        for (int i = 0; i < palindromLetters.length; i++) {
            //randomIndexPalindromLetters = random.nextInt(palindromLetters.length);
            //System.out.println("wylosowano indeks: " + randomIndexPalindromLetters);
            //palindrom[i] = palindromLetters[palindromLetters.length-1 - i];
            palindrom[i] = palindromLetters[i];

        }

        System.out.println("Palindrom = " + Arrays.toString(palindrom));
    }
}
