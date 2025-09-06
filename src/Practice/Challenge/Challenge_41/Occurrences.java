package src.Practice.Challenge.Challenge_41;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Please enter a number you want to find:");
        int num = input.nextInt();
        int occ = occurrences(numArr,num);
        System.out.println("Your element was found " + occ + " times in the array");

    }


    public static int occurrences(int[] numArr, int num){
        int occ  = 0;
        int i = 0;
        while (i < numArr.length){
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
