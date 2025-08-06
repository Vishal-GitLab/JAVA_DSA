package src.Practice.Coding;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Discount offer ");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("You are female? (True / False)");
        boolean isFemale = input.nextBoolean();

        if (age > 5) {
            System.out.println("You got 75% discount ");
        } else if (isFemale){
            System.out.println("You got 50% discount ");
        } else if ( age > 60 && !isFemale) {
            System.out.println("Ypu got 25% discount");
        }  else {
            System.out.println("You not got discount");
        }
    }
}
