package src.ProgramingChalenging;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd even calculator.....");
        System.out.print("please Enter your  number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Your number is Even");
        }
        else{
            System.out.println("Your number is odd number ");
        }
    }
}
