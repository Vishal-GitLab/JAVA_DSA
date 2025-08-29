package src.Practice.Challenge.Challenge_29;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = OddSum( num);
        System.out.println("Odd till " + num +" is " + sum);

    }
    public static  int OddSum(int num) {
        int i = 1;
        int sum = 0;
        while(i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
