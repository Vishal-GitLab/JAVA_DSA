package src.ProgramingChalenging;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd number: ");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd till " + num + " is: " + sum);

    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return  sum;
    }
}
