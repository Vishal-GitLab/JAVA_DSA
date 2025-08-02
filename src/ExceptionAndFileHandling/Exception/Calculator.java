package src.ExceptionAndFileHandling.Exception;

import src.OperatorIfElseandNumberSystem.Arithmetic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.print("Please enter your two number: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try {                       // agr hmko pahle se pta hgia ki9 divide me kabhi n kabhi zero aa sakta hai,, try ka use isliye karte hai hm pahle se bta dete hai ki yha eception hai
            int[] a = new int[5];
//            int result = first / second;
            System.out.printf("Result is %d",a[6]);         // agar exception nahi aayi to ye sidhe bahar chla jayega
             a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
        } catch (ArithmeticException exception) {               // catch ka use isliye karte hai ki try me koi bhi exception aayi to tum pakad lena usko
//            System.out.println("Divide by Zero, enter valid values");
            System.out.printf("%s, enter valid values",
                    exception.getMessage());           // jo exception ne get msg diya hai vo yha print hoga
        }   catch (Throwable th) {
            System.out.println("General Exception.");
        }
    }
}
