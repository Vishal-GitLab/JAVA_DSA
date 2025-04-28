package IfElseSwitchStatement_06;
 import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();   // integer se

        if( value % 2 == 0 && value % 3 == 0 ) {
            System.out.println(" Found ans -" + value);
        }
    }
}
