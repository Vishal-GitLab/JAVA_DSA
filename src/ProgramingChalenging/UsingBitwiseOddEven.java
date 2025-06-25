package src.ProgramingChalenging;

import java.util.Scanner;

public class UsingBitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bitwise odd even ....");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();



        if((num & 1) == 1 ){
            System.out.println(" Your number is Odd Number ");
        }
        else {
            System.out.println("Even number");
        }
    }
}


// agar hm binary table dekhe to laat me 0 aata hai to even hogi ,,,, yadi last me 1 aata hai to vah odd hogii