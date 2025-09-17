package src.Practice.Challenge.Challenge_60;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5, guess;
        do {
            System.out.print("Please guess the number between 0 and 10 : ");
            guess = input.nextInt();
        } while ( num != guess);
        System.out.println("You have successful guessed the number");
    }
}
