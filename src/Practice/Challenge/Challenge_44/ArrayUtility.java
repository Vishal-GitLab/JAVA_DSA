package src.Practice.Challenge.Challenge_44;

import java.util.Scanner;

public class ArrayUtility {
    public static  int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number of element: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please Enter element number:" +(i+1)+ ":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }


    public static  int[][]  input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Please enter the number of column: ");
        int column = input.nextInt();
        int numArray[][] = new int[row][column];


        int i = 0;
        while ( i < row) {
            int j = 0;
            while ( j < column) {
                System.out.print("Please enter row: " +(i+1)+
                        ", column" +(j+1)+ ":");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
    public static void dispalyArray(int[] numArray) {
        int i = 0;
        while ( i < numArray.length)
            System.out.print(numArray[i] + " ");
        i++;
    }
}
