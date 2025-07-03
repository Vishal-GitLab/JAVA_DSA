package src.ProgramingChalenging;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and Average");
        int[] numArray = ArrayUtility.inputArray();      // class lga kar method ko call kiya jata hai
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the number is: " + sum);
        System.out.println("Average of the number is: " + avg);
    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum = sum + numArray[i];
            i++;
        }
        return  sum;
    }
    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return  (sum / numArray.length);    // value int me lene ke liye (int) ka use karte hai

    }
}
