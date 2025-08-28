package src.Practice.Coding;

import java.util.Scanner;

public class ReturnFunction {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println(sum);

    }
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int number = input.nextInt();
        return number;
    }
    public static void greet() {
        System.out.println("Welcome to calculator");
    }
}
