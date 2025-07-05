package src.ProgramingChalenging;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter then number you want to delete:");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {           // int[]  --->> nya wala array return kra deta  hai  ,, method-->> deleteNumber
        // int[] array le rha hai jo delete karna hai
        int occ = OccurrencesArray.noOfOccurrences(numArr, numToDelete);          // OccurrencesArray hmara class hai , uske andar hmara noOfOccurrences class hai hmari
        if (occ == 0) {
            return numArr;        // agar occ 0 hai to vahi namArr ko returnn kar denge
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }


}
