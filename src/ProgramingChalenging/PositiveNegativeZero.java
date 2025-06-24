package src.ProgramingChalenging;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome the Number cheker\n");
        System.out.print("Please Enter your number:");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Your Number is positive");
        } else if (num == 0) {
            System.out.println("Your Number is zero");
        }
        else {
            System.out.println(" Number youe number is negative");
        }

    }
}
