package src.ProgramingChalenging;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number");
        System.out.print("Please Enter a number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Your number is a Palindrome number");
        } else {
            System.out.println("Your number is not  Palindrome number") ;
        }
    }
    public static boolean isPalindrome(int num) {
        return  num == reverse(num);

    }


    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /=10;
        }
        return newNum;
    }

}
