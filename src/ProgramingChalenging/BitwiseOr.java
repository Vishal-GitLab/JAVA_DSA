package src.ProgramingChalenging;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise Or Operator\n");
        System.out.print("Please Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Now, Enter the other number: ");
        int second = input.nextInt();


        int result = first | second;
        System.out.println("the result is:  " + result );



        // hm 6 ki bynary representation aur 12 ki bynary representtaion lenge to true aur false ka true ho jayega,,,,
        // false aur false ka false ho jayega ,, 6 uar 12 ki jab hm binary lenge to hme 14 ki binary milegi

    }
}
