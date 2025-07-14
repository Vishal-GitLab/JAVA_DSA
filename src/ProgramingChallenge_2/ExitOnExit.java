package src.ProgramingChallenge_2;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String command = input.next();
         //   if (command == "exit") {                // do object ko == to compare nahi kar sakte hai
          //  if (command.equals("exit")) {       // jab kinhi do chizo compare karna hota hai to ham .equals lga kar karte hai
                if (command.equalsIgnoreCase("exit")) {
                    break;
            }
        }
        System.out.println("Ypu have successfully exited.");
    }
}
