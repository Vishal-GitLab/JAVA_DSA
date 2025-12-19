package src.PracticeExp;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        for (int i = 0; i <num; i++) {
            System.out.println(i);
        }
    }
}
