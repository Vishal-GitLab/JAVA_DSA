package src.ProgramingChallenge_2;

import java.util.Scanner;

public class AbsoluteTernary {                                      // absolute value is positive value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value");
        System.out.print("Please enter your number: ");
       int num = input.nextInt();
       int result = num >= 0 ? num: -num;
        System.out.println("Absolute value is: " + result);


    }
}