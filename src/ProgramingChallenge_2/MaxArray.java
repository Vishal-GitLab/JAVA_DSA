package src.ProgramingChallenge_2;

import src.ProgramingChalenging.ArrayUtility;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr) {                                     // ak ak number pure array se nikal kar dena hai
            if (max < num) {                          // jab bhi max chhota hoga usko replace kar dunga
                max = num;
            }
        }
        System.out.print("Maximum number is: " + max);
    }
}
