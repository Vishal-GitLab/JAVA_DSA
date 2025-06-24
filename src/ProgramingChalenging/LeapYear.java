package src.ProgramingChalenging;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator\n");
        System.out.print("Please enter the year that you want to checked ");
        int year = input.nextInt();

      if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 )){
          System.out.println("Your Year is leap year");
        } else {
          System.out.println("Your year is not leap year");
      }
    }
}
