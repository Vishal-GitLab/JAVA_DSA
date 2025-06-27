package src.ProgramingChalenging;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World ");
        System.out.print("Please Enter a number: ");
        int num = input.nextInt();
        printMultiplicatinTable(num);
    }


    public static void printMultiplicatinTable(int num ) {
        int i = 1;
        while ( i <= 10 ) {
            System.out.println( num + " X " + i +   " = "  + (num*i));
            i++;
        }
    }
}
