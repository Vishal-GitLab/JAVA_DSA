package src.DataTypeVariableandInput.Challenge;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome our calculator");
        System.out.print("Enter a first number: ");
        int firstNum= input.nextInt();
        System.out.print("Now, please enter a second nummber ");
        int secondNum= input.nextInt();
        int sum = firstNum + secondNum;
        System.out.print("Sum of your number is :" + sum);

    }
}
