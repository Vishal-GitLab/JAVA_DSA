package src.Practice.Challenge.Challenge_44;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]  numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter then number you want to delete:");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("Here is your  new Array");
     ArrayUtility.displayArray(newArr);
    }


    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        // Find how many times numToDelete occurs in the array
        int occ = OccurrencesArray.noOfOccurrences(numArr,numToDelete);
        // If the number is not present at all, just return the original array
        if ( occ == 0 ){
            return numArr;
        }
        // Calculate the size of new array after removing 'occ' occurrences
        int newSize = numArr.length - occ;
        int[]  newArr = new int[newSize];

        int i = 0,  // pointer for old array
                j = 0;  // pointer for new array

        // Loop through old array
        while (i < numArr.length){
            // If current element is NOT equal to numToDelete, copy it into newArr
            if (numArr[i] != numToDelete ){
                newArr[j] = numArr[i];
                j++;  // move new array pointer forward
            }
            i++; // always move old array pointer
        }
        // Return the new array without the deleted number
        return newArr;
    }
}
