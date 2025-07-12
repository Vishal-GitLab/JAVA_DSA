package src.ProgramingChallenge_2;

import java.util.Scanner;

public class StudentsScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Student Score\n");
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();



         String category = marks > 80 ? "High": (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your number is " + category);


    }
}
