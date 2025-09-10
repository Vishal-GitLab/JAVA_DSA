package src.Practice.Challenge.Challenge_47;

public class MargeTwoSortedArray {
    public static void main(String[] args) {
        int[]  arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your number array is ");
        ArrayUtility.displayArray(mergedArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        // New array size = sum of both array lengths
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
                int i = 0,   // i = pointer for arr1
                j = 0,      // j = pointer for arr2
                        k = 0;      // k = pointer for newArr

        // Run loop until both arrays are fully traversed
        while ( i  < arr1.length || j < arr2.length ) {

            // Case 1: If arr2 is completely traversed, OR
            // arr1 still has elements and arr1[i] is smaller than arr2[j]
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];   // Copy from arr1
                i++;  // Move arr1 pointer
                k++;  // Move new array pointer
            } else {
                // Case 2: Otherwise, take element from arr2
                k++;  // Move arr2 pointer
                j++;      // Move new array pointer
            }
        }
        return newArr;    // Return merged sorted array
    }
}

