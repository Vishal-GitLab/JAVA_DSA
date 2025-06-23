package src.ProgramingChalenging;

import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator...");
        System.out.println("Please enter all 4 sides in cms: ");
        System.out.print("Enter a first number A: ");
        double a = input.nextDouble();
        System.out.print("Enter a second number B: ");
        double b= input.nextDouble();
        System.out.print("enter a third number C: ");
        double c= input.nextDouble();
        System.out.print("Enter a fourth number D: ");
        double d= input.nextDouble();

        double P = a+ b + c + d;
        System.out.println(P);
    }
}
