package src.Practice.Challenge.Challenge_45;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Yours reverse number is: ");
        ArrayUtility.displayArray(numArr);
    }


    public static void reverse(int[] arr){
        int i = 0;

        // Loop runs only till the middle of the array
        // Because reversing swaps two elements at a time
        while ( i < arr.length/2){
            // Save the current element at position i
            int swap = arr[i];
            // Swap element at i with element at (last - i)
            arr[i] = arr[(arr.length-1) - i];
            // Swap element at i with element at (last - i)
            arr[(arr.length-1) - i] = swap;
            i++;
        }
    }
}
