package src.ProgramingChalenging;

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the bitwise XOR: ");
        System.out.print("Enter a first number: ");
        int first = input.nextInt();
        System.out.print("Enter a second number: ");
        int second = input.nextInt();


        int result = first ^ second;
        System.out.println("This result is: " + result);





        // 10 aue 14 ka jab hm binary lenge to 4 ki binary milegi
        // XOR me jab bhi di chize same hongi to 0 ho jayega,,    1 aur 1 ka b hi 0 ho jayega,, ,, 0 aur 1 ki case 1 ho jayega


    }
}
