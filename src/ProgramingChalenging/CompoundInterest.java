package src.ProgramingChalenging;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound interest calculator: ");
        System.out.print("Please enter your principle amouunt :");
        int principle = input.nextInt();
        System.out.print("Now, Tell me your rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Now, tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your compound interest is Rs:" + compInt);
    }
}
