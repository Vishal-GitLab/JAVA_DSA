package src.ProgramingChalenging;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to  Prime number");
        System.out.print("Please Enter a number: ");
        int num  = input.nextInt();
        boolean isPrime = isPrime(num);
        if ( isPrime ) {
            System.out.println("Your number is prime ");
        }
        else {
            System.out.println("Your Number is not prime");
        }
    }


    public static boolean isPrime(int num) {               // yes or no ke liy ehm boolean ka use karte hai
        int i = 2;
        while ( i < num ) {
            if (num % i == 0 ) {
                return false;
            }
            i++;
        }
        return true;
    }

}
