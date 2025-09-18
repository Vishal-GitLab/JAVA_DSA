package src.Practice.Challenge.Challenge_68;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int count = input.nextInt();
        for ( int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
    public static int fibonacci(int position) {
        // This method calculates the Fibonacci number at the given 'position'
        if (position == 1) {
            // If position is 1, the Fibonacci number is 0
            return 0;
        }
        if (position == 2) {
           // If position is 2, the Fibonacci number is 1
            return 1;
        }
        return fibonacci(position-1) +
                 fibonacci(position-2);
        // Recursive Case:
        // For position > 2, Fibonacci number is the sum of
        // the two previous Fibonacci numbers.
        // Formula: F(n) = F(n-1) + F(n-2)
    }
}
