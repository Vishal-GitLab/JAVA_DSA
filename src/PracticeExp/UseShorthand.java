package src.PracticeExp;

import java.util.Scanner;

public class UseShorthand {
    public static void main(String[] args) {
        int p=5;
        Scanner input = new Scanner(System.in);
        int q1 = input.nextInt();

        p+=q1;

        System.out.println(p);
        int x2 = input.nextInt();
        p= p+x2;
        System.out.println(p);
        int x3 = input.nextInt();
        p=p+x3;
        System.out.println(p);
        int x4 = input.nextInt();
        p=p+x3;
        System.out.println(p);
    }
}
