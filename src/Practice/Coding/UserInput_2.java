package src.Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a enter name: ");
        String name = input.next();
        System.out.println("Good morning " + name);
        System.out.println(name + " Tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
    }
}
