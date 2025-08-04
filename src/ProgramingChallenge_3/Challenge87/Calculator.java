package src.ProgramingChallenge_3.Challenge87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter a second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")){
                System.out.println("Divide by zero occurred");
            } else {
                throw exception;                  // throw-->> mai handle thik se nahi kar paya jo exception hai vo mera parent dekhega
            }
        }
    }
}
