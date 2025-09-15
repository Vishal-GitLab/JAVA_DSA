package src.Practice.Challenge.Challenge_56;

import java.util.Scanner;

public class StudentTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();


        String  result = num > 80 ?  "High"  : (num > 50 ? "Moderate" : " Low");
        System.out.println("Your number is " + result);
    }
}
