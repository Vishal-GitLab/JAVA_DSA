package src.ProgramingChallenge_2;

import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding minimum\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter a second number: ");
        int num2 = input.nextInt();
        // ham jab static ke andar rahte hai to direactaly method ko call nahi kar sakte hai

        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is: " + min);

    }
     public int min(int num1, int num2 ) {
         return num1 < num2 ? num1 : num1;
        }

       }



