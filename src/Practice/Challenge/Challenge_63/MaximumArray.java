package src.Practice.Challenge.Challenge_63;

import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  arr = ArrayUtility.inputArray();



        int max = Integer.MIN_VALUE;
        // Step 1: Initialize max with the smallest possible integer value.
        //  So that any number in the array will be greater than this initial value.
        for ( int num: arr) {
            // Step 2: Loop through each element of the array 'arr'.
            if (max < num) {
                //  Compare current element 'num' with the current 'max'.
                // If the current element is greater than max, update max.
                max = num;
                // Step 4: Assign the bigger value to max.
            }
        }
        System.out.println("Your maximum number is: " + max);
    }
}
