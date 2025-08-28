package src.Practice.Challenge.Challenge_19;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        float marks = input.nextFloat();

        if (marks >= 90) {
            System.out.println("Great, You have got A");
        }

         else if (marks >= 75) {
            System.out.println("Good, You have got B");
        }
        else if (marks >= 60) {
            System.out.println("You have got C, Work harder next time");
        }
       else  if (marks >= 30) {
            System.out.println("You have got D, You need to work harder");
        }
        else {
            System.out.println("Sorry, you have failed the test and got F");
        }
    }
}
