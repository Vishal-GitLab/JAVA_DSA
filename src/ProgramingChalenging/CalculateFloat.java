package src.ProgramingChalenging;

import java.util.Scanner;

public class CalculateFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to float point..");
        System.out.print("Enter a value A: ");
        double a = input.nextDouble();      //float je liye left side double aur right side nextDouble() ka use karte hai
        System.out.print("Enter a value B: ");
        double b = input.nextDouble();
        System.out.println("Welcome two floating points:");

//    double mul = a * b;
//        System.out.println("\n Result is: " +mul);
       // System.out.println("\n Result is: " + a*b);
        System.out.println("\n Result is: " + (a+b));
    }
}
