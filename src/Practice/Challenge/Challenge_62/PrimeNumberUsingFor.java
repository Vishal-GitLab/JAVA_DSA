package src.Practice.Challenge.Challenge_62;

import java.util.Scanner;

public class PrimeNumberUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("Your number is " +
                (isPrime(num) ? "Prime" : "not Prime"));

    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
