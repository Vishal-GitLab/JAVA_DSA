package src.ProgramingChalenging;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is a not Armstrong");
        }
    }


    public static  boolean isArmstrong(int num) {
          int noOfDigit = noOfDigit(num);
          int numCopy = num;
          int finalNumber = 0;
          while (num > 0) {
              int lastDigit = num % 10;
              num /= 10;
              finalNumber += pow(lastDigit , noOfDigit);
          }
             return finalNumber == numCopy;
    }

    public static int pow(int num1 , int num2 ) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigit(int num ) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }


}
