package src.PracticeExp;

public class UsingParameter {
    public static void main(String[] args) {

        System.out.println(SumOfTwoNumber(3,3));
        System.out.println(SumOfTwoNumber(32,5));
    }
    public static int SumOfTwoNumber(int a,int b) {
        System.out.println("Enter your first number : " + a);
        System.out.println("Entre your second number: " + b);
         return a + b;
    }
}
