package src.OperatorIfElseandNumberSystem;

import java.util.Scanner;

public class Relatinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Driving licence");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();

        // 6==5 -->false    ,,,,,  5==5 ---true;
        //relational operator --> number, integer ko alag alag chizo ko lekar bollean me covert kar dete hai
        // multiple boolean ke liye ---> Logical operator ka use karte hai

        if( age>=18){
            System.out.println("You are eligible to driving ");
        }
        else{
            System.out.println("Beta abhi cycle chalao");
        }
    }
}
