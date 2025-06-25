package src.ProgramingChalenging;

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to showcase Bitwise Left shift Operator\n:");
        System.out.print("Please enter your  number: ");
        int num = input.nextInt();


        int result = num << 1;                           // hm kisi bhi digit se shift kar saktr hai
        System.out.println("the result is: " + result);
    }
}



   // jitni baar hm kisi binary number ko lift sift karenge utni baar kisi nunber ki power badhti hai
