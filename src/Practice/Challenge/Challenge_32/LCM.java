package src.Practice.Challenge.Challenge_32;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int first = input.nextInt();
        System.out.print("Enter a second number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("LCM of two number = " + lcm);

    }

    public static int lcm(int first, int second) {  // call lcm() method
        int i = 1;
        while(true) {
            int factor = first*i;   // multiples of first number
            if (factor % second == 0){    // check divisibility by second
                return factor;  // first common multiple found → LCM
            }
            i++;
        }
    }
}
