package src.Practice.Challenge.Challenge_49;

public class SumAndAverage2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();
        double sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array  is: " + avg);
    }


    public static double average(int[][] numArr) {
        // If the array has 0 rows (empty array), return 0 to avoid errors
        if (numArr.length == 0){
         return 0;
     }
        // Number of rows in the 2D array
        int rows = numArr.length;
        // Number of columns (from the first row, assuming all rows have equal length)
        int cols = numArr[0].length;
        // Total number of elements in the 2D array
     double size = rows* cols;
        // Average = sum of all elements / total number of elements
     return sum(numArr) / size;
    }



    public static double sum(int[][] numArr) {
        // Use long to handle large sums (avoids overflow for big arrays)
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length ) {
                // Add current element to sum
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
