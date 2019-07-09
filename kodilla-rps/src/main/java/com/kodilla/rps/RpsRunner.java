package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        rps();
    }
    public static int numberOfRounds(Scanner myObj) {

        while (true) {
            System.out.println("Ile rund będzie miała gra?");
            String s = myObj.nextLine();
            try {
                int n = Integer.parseInt(s);
                    return n;

            } catch (Exception e) {
                System.out.println("To nie jest liczba. Spróbuj jeszcze raz.");
            }
        }

    }
    public static void playAgainInquiry(Scanner myObj, char userChoice){
        System.out.println("Czy chcesz zagrać jeszcze raz? y/n");
        userChoice = myObj.next().charAt(0);
        if (userChoice=='y')
        {
            System.out.println("Zacznamy od nowa.\n");
            rps();
        }
        if(userChoice=='n');
        {
            System.out.println("Dzięki za grę.\n");
        }
        if(!((userChoice=='y')||(userChoice=='n'))){
            System.out.println("Zły wybór. Podaj odpowiedź używając klawiszy y lub n.\n");
            playAgainInquiry(myObj, userChoice);
        }
    }
    public static void resultDisplay( int computerResult, int userResult, String userName){
        if(computerResult>userResult){
            System.out.println(userName + " Niestety, ale wygrał komputer: " + computerResult + " : " + userResult + "\n" );
        }
        else if (computerResult<userResult) {
            System.out.println(userName + " Brawo! Wygrałeś z komputerem: " + userResult + " : " + computerResult + "\n");
        }
        else
            System.out.println(userName + " Remis: " +  + userResult + " : " + computerResult + "\n");
    }
    public static void rpsPointsAssignement(int roundQuantity, int actualRound, Scanner myObj, char userChoice, int computerChoice, int computerResult, int userResult, String userName ){
        while(roundQuantity>0){
            System.out.println("Runda " + actualRound);
            System.out.println("Wybierz klawisz od 1 do 3. W każdej chwili możesz przerwać naciskając klawisz 'x', lub zacząć od nowa naciskając klawisz 'n'.");
            userChoice = myObj.next().charAt(0);
            System.out.println("Wybrałeś: " + userChoice);
            Random random = new Random();
            computerChoice = random.nextInt(3)+1;
            System.out.println( "Komputer wybrał: " + computerChoice);

            if(userChoice == 'x')
            {
                System.out.println("Czy na pewno zakończyć grę? y/n");
                userChoice = myObj.next().charAt(0);
                if(userChoice=='y'){
                    System.out.println("Dzięki za grę. Do widzenia.");
                }
                else if(userChoice=='n')
                    continue;
                else {
                    System.out.println("zły wybór");
                    continue;
                }
            }
            if(userChoice == 'n')
            {
                System.out.println("Czy na pewno zakończyć aktualną grę? y/n");
                userChoice = myObj.next().charAt(0);
                if(userChoice=='y')
                {
                    System.out.println("Zacznamy od nowa.");
                    rps();
                }
                else if(userChoice=='n')
                    continue;
                else System.out.println("zły wybór.");
            }
            if(!(userChoice == '1'||userChoice == '2'||userChoice == '3')){
                System.out.println("Podałeś znak/liczbę z poza zakresu liczbowego 1-3. Podaj prawidłowy klawisz.");
                continue;
            }
            if((userChoice == '1' && computerChoice == 1)||(userChoice == '2' && computerChoice == 2)||(userChoice == '3' && computerChoice == 3))
            {
                System.out.println("Remis. Bez punktu dla każdego.\n");
            }
            if((userChoice == '1' && computerChoice==2)||(userChoice == '2' && computerChoice==3)||(userChoice == '3' && computerChoice==1))
            {
                System.out.println("Przegrałeś runde. Punkt dla komputera.\n");
                computerResult = computerResult+1;
            }
            if((userChoice == '1' && computerChoice==3)||(userChoice == '3' && computerChoice==2)||(userChoice == '2' && computerChoice==1))
            {
                System.out.println("Wygrałeś runde. Punkt dla Ciebie.\n");
                userResult = userResult+1;
            }

            actualRound++;
            roundQuantity--;
        }
        resultDisplay(computerResult, userResult, userName);
        playAgainInquiry(myObj, userChoice);
    }
    public static void instructionDisplay(String userName, int roundQuantity){
        System.out.println("Twoje imię to: " + userName + ". Ilosc rund po ktorych nastapi zwyciestwo to: " +  roundQuantity +".");
        System.out.println("Instrukcja gry: \n" +
                "klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, poprzedzone pytaniem \"Czy na pewno zakończyć grę?\",\n" +
                "klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\",\n");
    }
    public static void rps(){
        char userChoice = 0;
        int computerChoice = 0;
        int userResult = 0;
        int computerResult = 0;
        int actualRound = 1;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String userName = myObj.nextLine();
        int numberOfRounds = numberOfRounds(myObj);
        instructionDisplay(userName, numberOfRounds);
        rpsPointsAssignement(numberOfRounds, actualRound, myObj, userChoice, computerChoice, computerResult, userResult, userName);
    }

}
