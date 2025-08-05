package src.Practice.Coding;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving licence");
        System.out.print("Please enter your age: ");

        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible");
        }
        else {
            System.out.println("You are not eligible");
        }
    }

}
