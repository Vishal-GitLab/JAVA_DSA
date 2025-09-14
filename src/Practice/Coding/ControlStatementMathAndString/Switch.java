package src.Practice.Coding.ControlStatementMathAndString;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your  day in number: ");
        int day = input.nextInt();;

// Call the new style switch expression
        newSwitch(day);
        // You could also call the old style for comparison:
        // oldSwitch(day);
    }
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid day";
        };
        // Print the result stored in dayStr
        System.out.println(dayStr);
    }


    public static void oldSwitch(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6,7:
                System.out.println("Holiday");
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
}
