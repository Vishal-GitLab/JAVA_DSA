package src.Practice.Coding;

public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(6,7));
        System.out.println(sumTwoNumber(10,30));

    }
    public static  int sumTwoNumber(int firstNumber, int secondNumber) {
        System.out.println("First number recieved " + firstNumber);
        System.out.println("First number recieved " + secondNumber);
        return firstNumber + secondNumber;
    }
}
