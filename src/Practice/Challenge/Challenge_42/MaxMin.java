package src.Practice.Challenge.Challenge_42;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        int min = min(numArr);
        int max  = max(numArr);
        System.out.println("Your min number: " + min);
        System.out.println("Your max number is: " + max);
    }

    public static  int min(int[] numArr){
        if (numArr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = numArr[0];
        int i = 0;
        while (i < numArr.length) {
            if (min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

    public static  int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 0;
        while (i < numArr.length) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }
        return max;

    }
}
