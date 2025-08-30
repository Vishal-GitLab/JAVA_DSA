package src.Practice.Challenge.Challenge_34;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (isPrime(num)) {
            System.out.println("Your number is prime");
        }
        else {
            System.out.println("Your number is not prime");
        }
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num){
          if (num % i == 0) {
              return false;
          }
          i++;
        }
        return true;
    }
}
