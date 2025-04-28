package Taking_Input_04;

import java.util.Scanner;

public class SumofTwoNumber {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num_1 = sc.nextInt();

        System.out.println("Enter your Second number");
        int num_2 = sc.nextInt();

        int Sum = num_1 + num_2;

        System.out.println("Sum: " + Sum);
    }
}
