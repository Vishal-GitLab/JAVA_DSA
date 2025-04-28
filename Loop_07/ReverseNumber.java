package Loop_07;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


//         for(int num = n; num >= 1; num-=2) {    // num-= --> num = num - 2;
//             System.out.println(num);
//         }
        int num = n;
        for(; num>=1; num-=1) {
            System.out.println(num);
        }
    }
}
