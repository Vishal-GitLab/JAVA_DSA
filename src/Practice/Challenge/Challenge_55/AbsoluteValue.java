package src.Practice.Challenge.Challenge_55;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int result = (num >= 0) ? num : - num;
        System.out.println("Absolute value is " +result);
    }
}
