package src.ControlsStatementMathAndString;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {                    // main method static function hai ,, TernaryOperator.main likhega aur TernaryOperator main method ko call kar dega
        Scanner input = new Scanner(System.in);           // Scanner input hmne declare kiya hai,, Scanner class ka ak referance bnaya hai input  hai,, new ak object bnaya hai,,, Scanner ko constructor call kar rha hai ,, jo as ak dusra object(System.in) ki input lta hai dusre object ki property hai
        System.out.println("Welcome to the number checker\n");
        System.out.print("Please Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter your second number: ");
        int num2 = input.nextInt();
//
//        if (num1 > num2) {
//            System.out.println(num1 + " is the gratest number");
//        } else {
//            System.out.println(num2 + " is the gratest number");
//
//        }

        // below this code for the ternary operator
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println( greaterNumber + " is the gratest number");

    }
}
