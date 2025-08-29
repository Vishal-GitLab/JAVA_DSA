package src.Practice.Challenge.Challenge_28;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Multiplication table");
        System.out.print("Please enter a number: ");
            int num = input.nextInt();

            MultiplicationTable(num);
        }
        public static void MultiplicationTable ( int num){
            int i = 1;
            while (i <= 10) {
                System.out.println(num + "X" + i + "=" + num * i);
                i++;
            }
        }
    }
