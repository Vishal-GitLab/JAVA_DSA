package src.DataTypeVariableandInput;

import java.util.Scanner;  // Import-->jo pahli class hai uska use karna

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // iska use object declearation ,,  input--> referance ,,, right side--> object
                  //  System.in --> default input se scan karna
        System.out.print("Please Enter your number: ");
        String name = input.nextLine();   // nest line karne ke liye use karte hai
        System.out.println("Good Morning ," + name);  // string ko jodne ke liye  plus(+) ka use karte hai

        System.out.print(name + ", Also tell me your age:");
        int age = input.nextInt();    // ye ak method hai
        System.out.println("Your age is : " + age);
    }
}
