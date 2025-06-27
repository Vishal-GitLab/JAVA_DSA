package src.WhileLoopMethodAndArray;

import java.util.Scanner;

public class ReturnFunction {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        int number = input.nextInt();
        return number;                                  //return statement is ---->> agar kuch bhi return karana hoaga to return vaha chla jayeg jaha par method call huaa hai
    }
    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }
}
