package src.Practice.Coding.ControlStatementMathAndString;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter a second number: ");
        int num2 = input.nextInt();




        // This line uses the ternary operator ( ? : ) to find the greatest number between num1 and num2
        // If num1 > num2 is true, then greatestNumber = num1
        // Otherwise (false case), greatestNumber = num2
        int greatestNumber = num1 > num2 ?  num1:num2;
        // This line prints the result, showing which number is the greatest
        System.out.println(greatestNumber + " is the greatest number");
    }
}
