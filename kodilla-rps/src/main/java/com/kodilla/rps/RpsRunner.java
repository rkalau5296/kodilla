package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String userName = myObj.nextLine();
        int userChoice;
        int computerChoice;
        int userResult = 0;
        int computerResult = 0;
        System.out.println("Ile rund będzie miała gra?");
        int roundQuantity = myObj.nextInt();
        System.out.println("Twoje imię to: " + userName + ". Ilosc rund po ktorych nastapi zwyciestwo to: " +  roundQuantity +".");
        System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",");

        boolean end = false;
        int actualRound = 1;

        while(roundQuantity>0){
            System.out.println("Runda " + actualRound);
            System.out.println("Wybierz klawisz od 1 do 3. W każdej chwili możesz przerwać naciskając klawisz 'x', lub zacząć od nowa naciskając klawisz 'n'.");
            userChoice = myObj.nextInt();
            System.out.println("Wybrałeś: " + userChoice);
            Random random = new Random();
            int x = 1;
            int y = 3;
            computerChoice = random.nextInt((y-x+1)+x );
            System.out.println( "Komputer wybrał: " + computerChoice);
            if((userChoice == 1 && computerChoice == 1)||(userChoice == 2 && computerChoice == 2)||(userChoice == 3 && computerChoice == 3))
            {
                System.out.println("Remis. Bez punktu dla każdego");
            }
            if((userChoice == 1 && computerChoice==2)||(userChoice == 2 && computerChoice==3)||(userChoice == 3 && computerChoice== 1)){
                System.out.println("Przegrałeś runde. Punkt dla komputera.");
                computerResult = computerResult+1;
            }
            if((computerChoice == 1 && userChoice==2)||(computerChoice == 2 && userChoice==3)||(computerChoice == 3 && userChoice== 1)){
                System.out.println("Wygrałeś runde. Punkt dla Ciebie.");
                userResult = userResult+1;
            }
            roundQuantity--;
        }
    }
}
