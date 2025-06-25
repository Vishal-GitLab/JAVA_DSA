package src.ProgramingChalenging;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And Operator\n");
        System.out.print("Please Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Now, Enter the other number: ");
        int second = input.nextInt();


        int result = first & second;
        System.out.println("the result is:  " + result );






        // yadi hm first number me 12 lete hai to aur second number me 5 lete hai to dono ko add karne par jo value aayegi vo 4 ki binary representation hogi
          // 12 ki binary represention 1100 aur 5  ki 0101 hogi isko jab add karenge to true and false ka false hoga aur true arue ks true hogs

    }
}
