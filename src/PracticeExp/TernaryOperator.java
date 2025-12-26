package src.PracticeExp;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();



        int greatestNumber = num1 > num2 ? num1:num2;
        System.out.println(greatestNumber + " Your greatest number");
    }
}
