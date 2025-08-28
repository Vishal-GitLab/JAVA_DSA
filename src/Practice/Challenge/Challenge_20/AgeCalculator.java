package src.Practice.Challenge.Challenge_20;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();


        if (age >= 65) {
            System.out.println("You are Senior Person");
        }
        else if (age >= 20) {
            System.out.println("You are Adult Person");
        }
        else if (age >= 13) {
            System.out.println("You are Teenger ");
        }
        else {
            System.out.println("You are child Person");
        }
    }
}
