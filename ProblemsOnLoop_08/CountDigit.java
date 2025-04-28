package ProblemsOnLoop_08;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;
        while (n > 0) {

            n = n / 10;
                numOfDigits++;
        }
        System.out.println("Numbur of Digit in " + original_n + " = " + numOfDigits);
    }
}
