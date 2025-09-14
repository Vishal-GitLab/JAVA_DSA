package src.Practice.Challenge.Challenge_54;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter your first number: ");
        int num = input.nextInt();

    String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your result is " + result + " number");
    }
}
