package src.ProgramingChalenging;

import java.util.Scanner;

public class GratestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Three\n ");
        System.out.print("Please Enter your first number:");
        int first = input.nextInt();
        System.out.print("Now Enter a second number:");
        int second = input.nextInt();
        System.out.print("Finally Enter a third number: ");
        int third = input.nextInt();

//                if(first > second && first > third){
//                    System.out.println("First number is greatest number");
//                } else if (second > first && second > third) {
//                    System.out.println("Second number is greatest number ");
//                }
//                else {
//                    System.out.println("Third number is greatest number");
//                }


        if(first >= second && first >= third){
            System.out.println(first + " is the greatest number");
        } else if (second >= first && second >= third) {
            System.out.println(second + " is the greatest number");
        } else {
            System.out.println(third + " is the greatest number");
        }
    }
}
