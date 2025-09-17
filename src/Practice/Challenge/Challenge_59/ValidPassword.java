package src.Practice.Challenge.Challenge_59;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = input.next();
        } while ( !PasswordChaker(password) );
            System.out.println("Thanks for entering a valid password");


    }
    public static boolean PasswordChaker(String password) {
        return password.length() > 6;
    }
}
