package src.Practice.Challenge.Challenge_35;

import java.util.Scanner;

public class ReverseDIgit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits ");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is " + reverse);
    }

    public static  int reverse(int num ){
        int newNum = 0;
        while (num > 0){
            // Jab tak num > 0 hai (yaani number ke digits bache hain)
            int digit = num % 10;
            // % 10 se number ka last digit nikalta hai
            newNum = newNum*10 + digit;
            // Pichle reversed number ko 10 se multiply karke
            // naye digit ko add kar dete hain
            num /=10;
            // Number ko 10 se divide karke last digit hata dete hain
        }
        return newNum;
    }

}
