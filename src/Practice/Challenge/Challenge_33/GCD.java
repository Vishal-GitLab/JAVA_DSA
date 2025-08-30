package src.Practice.Challenge.Challenge_33;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int first = input.nextInt();

        System.out.print("Enter your number: ");
        int second = input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("Your gcd is =" + gcd);
    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;   // Default gcd is 1
        int i = 2;     // Start checking from 2 because 1 divides everything

        // Find the smaller number (least) between num1 and num2
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    // Method to return the smaller of two numbers
    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
