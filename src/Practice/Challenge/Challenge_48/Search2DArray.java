package src.Practice.Challenge.Challenge_48;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("Now, you want to search the number: ");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("Your number is found");
        }  else {
            System.out.println("Your number is not found");
        }
    }


    public static boolean search(int[][] numArr, int num ){
        // Start with the first row (index 0).
        int i = 0;
        // Outer loop → goes through each row of the 2D array
        while (i < numArr.length) {
            // Start with the first column (index 0) of the current row
            int j = 0;
            // Inner loop → goes through each element (column) in the current row
            while (j < numArr[i].length) {
                // Check if the current element matches 'num'
                if (numArr[i][j] == num){
                    return  true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
