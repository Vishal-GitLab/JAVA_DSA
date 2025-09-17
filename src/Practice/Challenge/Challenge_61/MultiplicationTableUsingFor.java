package src.Practice.Challenge.Challenge_61;

import java.util.Scanner;

public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextByte();


        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
