package src.Practice.Challenge.Challenge_17;

import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int first = input.nextInt();
        System.out.print("Please enter a second number: ");
        int second = input.nextInt();
        System.out.print("Please enter a third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " First number is greatest number");
        } else if (second >= first && second >= third) {
            System.out.println(second + " Second number is greatest number");
        } else {
            System.out.println(third + " Third number is greatest number");
        }
    }
}
