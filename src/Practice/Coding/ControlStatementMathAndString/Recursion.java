package src.Practice.Coding.ControlStatementMathAndString;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();


//        long fact = factorialIterative(num);
//        System.out.println("Your factorial number is: " + fact);

         long fact = factorial(num);
        System.out.println("Your factorial number is : " + fact);
    }

    public static long factorial(int num ){
        if (num == 1) {
            return 1;

        }
        return num*factorial(num-1);
    }


//    public static long factorialIterative(int num) {
//        long result = 1;
//        for (int i = 1; i <= num; i++) {
//            result *= i;
//        }
//        return result;
//    }

}
