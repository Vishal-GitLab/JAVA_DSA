package src.Practice.Challenge.Challenge_66;

import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();

        int sum  = 0;
        for (int num: numArr){
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("Your sum number is: " + sum);
    }
}
