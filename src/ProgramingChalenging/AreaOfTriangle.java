package src.ProgramingChalenging;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area calculator\n");
        System.out.print("Please enter your base in cms: ");
       double base= input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();

//        double area = 0.5 * base * height;
        double area = (base * height)/2;

        System.out.println("The area of your triangle is: " + area + "cms");

    }
}
