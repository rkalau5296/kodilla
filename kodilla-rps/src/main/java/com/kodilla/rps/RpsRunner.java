package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String userName = myObj.nextLine();
        char userChoice;
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

        int actualRound = 1;

        while(roundQuantity>0){
            System.out.println("Runda " + actualRound);
            System.out.println("Wybierz klawisz od 1 do 3. W każdej chwili możesz przerwać naciskając klawisz 'x', lub zacząć od nowa naciskając klawisz 'n'.");
            userChoice = myObj.next().charAt(0);

            if(userChoice == 'x')
            {
                System.out.println("Czy na pewno zakończyć grę? y/n");
                userChoice = myObj.next().charAt(0);
                if(userChoice=='y')
                    return;
                else if(userChoice=='n')
                    continue;
                else System.out.println("zły wybór");
            }
            if(userChoice == 'n')
            {
                System.out.println("Czy na pewno zakończyć aktualną grę? y/n");
                userChoice = myObj.next().charAt(0);
                if(userChoice=='y')
                {
                    System.out.println("Zacznamy od nowa.");
                    continue;
                }
                else if(userChoice=='n')
                    continue;
                else System.out.println("zły wybór");
            }
            if(!(userChoice == '1'||userChoice == '2'||userChoice == '3')){
                System.out.println("Podałeś znak/liczbę z poza zakresu liczbowego 1-3. Podaj prawidłowy klawisz.");
                continue;
            }
            System.out.println("Wybrałeś: " + userChoice);
            Random random = new Random();
            computerChoice = random.nextInt(3)+1;
            System.out.println( "Komputer wybrał: " + computerChoice);
            if((userChoice == '1' && computerChoice == 1)||(userChoice == '2' && computerChoice == 2)||(userChoice == '3' && computerChoice == 3))
            {
                System.out.println("Remis. Bez punktu dla każdego");
            }
            if(       (userChoice == '1' && computerChoice==2)
                    ||(userChoice == '2' && computerChoice==3)
                    ||(userChoice == '3' && computerChoice==1)
                    ||(computerChoice == '1' && userChoice==3)
                    ||(computerChoice == '3' && userChoice==2)
                    ||(computerChoice == '2' && userChoice==1))
            {
                System.out.println("Przegrałeś runde. Punkt dla komputera.");
                computerResult = computerResult+1;
            }
            if(       (computerChoice == '1' && userChoice==2)
                    ||(computerChoice == '2' && userChoice==3)
                    ||(computerChoice == '3' && userChoice==1)
                    ||(userChoice == '1' && computerChoice==3)
                    ||(userChoice == '3' && computerChoice==2)
                    ||(userChoice == '2' && computerChoice==1)
                    )
            {
                System.out.println("Wygrałeś runde. Punkt dla Ciebie.");
                userResult = userResult+1;
            }
            actualRound++;
            roundQuantity--;
        }
        if(computerResult>userResult){
            System.out.println(userName + " Niestety, ale wygrał komputer: " + computerResult + " : " + userResult );
        }
        else if (computerResult<userResult) {
            System.out.println(userName + " Brawo! Wygrałeś z komputerem: " + userResult + " : " + computerResult);
        }
        else
            System.out.println(userName + " Remis: " +  + userResult + " : " + computerResult);
    }
}
