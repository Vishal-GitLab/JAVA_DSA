package src.Practice;

import java.util.Scanner;

public class SumOfTwo_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Your sum is: " + sum);
    }
}
