package src.Practice.Challenge.Challenge_46;

public class Palindrome {
    public static void main(String[] args) {
        int[]  numArr = ArrayUtility.inputArray();
       boolean isPalin = isPalindrome(numArr);

       if (isPalin){
           System.out.println("Your array is Palindrome");
       }

       else {
           System.out.println("Your array is not Palindrome");
       }

    }



    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        // Loop only till the middle of the array
        while (i < numArr.length/2) {
            // Compare the element at the front (i) with the element at the back (length-1-i)
            if (numArr[i] != numArr[numArr.length -1 - i]){
                // If any mismatch found, it's not a palindrome
                return false;
            }
            // Move forward
            i++;
        }
        // If loop completes without mismatches, array is a palindrome
        return true;
    }
}
