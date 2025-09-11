package src.Practice.Challenge.Challenge_50;

public class SumDiagonal2dArray {
    public static void main(String[] args) {
        int[][]  numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("Your sum of Diagonal is:" + sum);
    }

    public static long sumOfDiagonal(int[][] numArr) {
        // Sum of the left diagonal (top-left to bottom-right)
        long leftSum = sumOfLeftDiagonals(numArr);
        // Sum of the right diagonal (top-right to bottom-left)
        long rightSum = sumOfRightDiagonals(numArr);
        long sum = leftSum + rightSum;

        // If the matrix has an odd size, the center element belongs to BOTH diagonals
        // Example: In a 3x3 matrix, element [1][1] is counted twice.
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2;    // Middle index
            sum -= numArr[ind][ind];           // Subtract the duplicate middle element once
        }
        return  sum;
    }


    // Method to calculate the sum of the left (primary) diagonal
// This diagonal runs from top-left → bottom-right
    public static long sumOfLeftDiagonals(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];    // Element at [i][i] (row = column)
            i++;
        }
        return sum;
    }

    // Method to calculate the sum of the right (secondary) diagonal
// This diagonal runs from top-right → bottom-left
    public static long sumOfRightDiagonals(int[][] numArr) {
        long  sum = 0;
        int i  = 0;
        while (i < numArr.length){
            int col = numArr.length - 1 - i;    // Column index from right side
             sum += numArr[i][col];            // Element at [i][col]
            i++;
        }
        return sum;
    }
}
