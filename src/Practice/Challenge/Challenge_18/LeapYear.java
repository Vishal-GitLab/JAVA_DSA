package src.Practice.Challenge.Challenge_18;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
            System.out.println("Your number is leap year");
        }
        else {
            System.out.println("Your number is not leap year");
        }
    }
}
