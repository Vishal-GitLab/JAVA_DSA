package Loop_07;
import java.util.Scanner;
public class StreamOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

//        while( num != -1) {
//            sum = sum + num;
//            num  = sc.nextInt();   //  user se input lene ke liye
//        }
//        System.out.println(sum);
        do{
            sum = sum + num;
            num = sc.nextInt();
        } while ( num != -1);
        System.out.println(sum);
    }
}
