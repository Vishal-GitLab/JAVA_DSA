package ProblemsOnLoop_09;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();



        for(int i = 1; i <= r; i++){ // traversing over spaces
            // print r-i spaces
            for(int j = 1; j <= r-i; j++ ){
                System.out.print(" ");
            }

            // print 2*i - 1;
            for(int k = 1; k <= 2*i - 1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
