package Loop_07;
import java.util.Scanner;
public class For_NumberOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int sum = 0;
        // int num = 1;

         for(int num = 1; num <= n; num++) {
             sum = sum + num;
         }
         System.out.println(sum);
    }
}
