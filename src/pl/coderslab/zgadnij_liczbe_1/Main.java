package pl.coderslab.zgadnij_liczbe_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int randomNumberToGuess = getRandomNumber();
        boolean numberGuessed = false;

        while (!numberGuessed){
            int number = getIntFromUser();

            if (number > randomNumberToGuess){
                System.out.print("\nZa dużo!");
            } else if (number < randomNumberToGuess){
                System.out.print("\nZa mało!");
            } else {
                System.out.print("\nZgadłeś!");
                numberGuessed = true;
            }
        }
    }

    static int getRandomNumber(){

        Random r = new Random();
        int number = r.nextInt(100)+1;

        return number;
    }

    static int getIntFromUser(){

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("\nZgadnij liczbe: ");
        while (!keyboardInput.hasNextInt()){

            System.out.print("\nTo nie jest liczba całkowita! Podaj liczbę: ");
            keyboardInput.next();
        }

        int numberFromUser = keyboardInput.nextInt();
        return numberFromUser;
    }
}
