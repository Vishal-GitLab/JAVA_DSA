package src.Practice.Challenge.Challenge_53;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();




        int Minimum  = num1 < num2 ? num1 : num2;
        System.out.println(Minimum + " Your Minimum number");
    }
}
