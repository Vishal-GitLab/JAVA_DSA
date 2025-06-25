package src.ProgramingChalenging;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to showcase Bitwise Rightcase Operator\n:");
        System.out.print("Please enter your  number: ");
        int num = input.nextInt();


        int result = num >> 1;                           // hm kisi bhi digit se shift kar saktr hai
        System.out.println("the result is: " + result);
    }
}



 // jaise maan lo hmne 10 number le liye
// 10 ka hmne binary liya 1010 0101 h
// hm 7 ka lete hai to 0111 hai to 011 ho jata haii jo ki 3 ka hai