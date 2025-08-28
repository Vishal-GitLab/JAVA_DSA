package src.Practice.Challenge.Challenge_16;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println( + num + " number is even");
        }
        else {
            System.out.println( + num + " number is odd");
        }
    }
}
