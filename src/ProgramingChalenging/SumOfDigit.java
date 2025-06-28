package src.ProgramingChalenging;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of digit ");
        System.out.print("Please Enter  your number: ");
        int num = input.nextInt();
        int digit = sumofdigit(num);
        System.out.println("the sum digit is " + digit);
    }

    public static  int  sumofdigit(int num) {
        int sum = 0;
        while( num > 0) {
            sum += num % 10;
             num = num / 10;
        }
        return sum;
    }

}
