package src.PracticeExp;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        long fact = Fact(num);
        System.out.println(fact);

    }
    public static long Fact(int num ) {
        if (num == 0) {
            return 1;
        }
        return  num * Fact(num-1);
    }
}
