package ProblemsOnLoop_09;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for( int i = 1; i <= r; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


