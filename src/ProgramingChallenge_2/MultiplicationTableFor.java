package src.ProgramingChallenge_2;

import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing table\n");
        System.out.print("Please enter the number you want to print table of: ");
        int num = input.nextByte();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + " = " + (num*i));
        }
    }
}
