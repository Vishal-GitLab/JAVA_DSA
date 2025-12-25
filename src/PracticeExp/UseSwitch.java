package src.PracticeExp;

import java.util.Scanner;

public class UseSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your day: ");
        int day = input.nextInt();
        NewSwitch(day);
    }

    public static void NewSwitch(int day) {

        String dayStr =  switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }
}
