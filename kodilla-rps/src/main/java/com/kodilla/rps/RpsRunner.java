package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String userName = myObj.nextLine();

        System.out.println("Ile rund będzie miała gra?");
        int roundQuantity = myObj.nextInt();
        System.out.println("Twoje imię to: " + userName + ". Ilość rund po których nastąpi zwycięstwo to: " +  roundQuantity +".");
        System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",");
//        boolean end = false;
//
//        while(!end){
//
//        }
    }
}
