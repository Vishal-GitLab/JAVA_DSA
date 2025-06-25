package src.ProgramingChalenging;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator..");
        System.out.print("Please, Enter your number:");
        int num = input.nextInt();



        int result = ~num;
        System.out.println("The result is: " + result);
    }
}


// XOR me chahe jo hm binary lete hai uska ulta ho jata hai

