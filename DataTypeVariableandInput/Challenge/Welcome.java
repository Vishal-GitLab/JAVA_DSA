package src.DataTypeVariableandInput.Challenge;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= input.nextLine();
        System.out.print("Welcome " + name + " to College");
    }
}
