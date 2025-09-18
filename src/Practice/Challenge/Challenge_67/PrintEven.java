package src.Practice.Challenge.Challenge_67;

public class PrintEven {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++ ) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
