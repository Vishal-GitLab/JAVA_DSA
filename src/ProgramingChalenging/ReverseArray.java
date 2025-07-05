package src.ProgramingChalenging;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal\n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reverse array is");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int[] arr) {
     int i = 0;
     while (i < arr.length / 2) {
         int swap = arr[i];
         arr[i] = arr[(arr.length - 1) - i];     // 0th element ko last wale element se replace(swap) karu
         arr[(arr.length - 1) - i ] = swap;
         i++;
     }
    }
}
