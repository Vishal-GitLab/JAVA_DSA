package src.Practice.Challenge.Challenge_65;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        while (true) {                          // This loop will run forever until we explicitly break it
            System.out.print("Enter your command: ");      // Ask the user to type a command
            String command = input.next();        // Read the user's input (one word) from the Scanner named 'input'
            if (command.equalsIgnoreCase("exit")) {    // Check if the user typed "exit" (ignoring upper/lower case)
                break;                                               // If the input is not "exit", the loop continues
            }
        }
        System.out.println("You have successfully exited");
    }
}
