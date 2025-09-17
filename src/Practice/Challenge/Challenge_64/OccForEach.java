package src.Practice.Challenge.Challenge_64;

import java.util.Scanner;

public class OccForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = ArrayUtility.inputArray();
        System.out.print("Please, Enter a number you want to search: ");
        int element = input.nextInt();
        int occ = countOccurrences(nums,element);
        System.out.println("Your element was found " + occ + " times");

    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for (int num: nums) {  // Loop through each number in the array
            if (num == element) {    //  Check if current number == element
                occ++;                   //  If yes, increase the counter
            }
        }
        return occ;     //Return the final count
    }
}
