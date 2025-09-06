package src.Practice.Challenge.Challenge_40;

import java.util.Scanner;

public class SumAndAverage2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        double sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your sum of array is: " + avg);

    }


    public static double average(int[][] numArr) {
        if (numArr.length == 0 ) {
            return 0;
        }
        int row = numArr.length;
        int cols = numArr[0].length;
        double size = row * cols;
        return  sum(numArr) / size;

    }



    public static double sum(int[][] numArray ) {
        long sum = 0;
        int  i = 0;
        while ( i < numArray.length) {
            int j = 0;
             while (j < numArray[i].length) {
                 sum += numArray[i][j];
                 j++;
             }
             i++;
        }
        return sum;
    }
}
