package Taking_Input_04;
import java.util.Scanner;
public class Read_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch =sc.next().charAt(0);


        System.out.println("Character is : " +  ch);
    }
}
