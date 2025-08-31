package src.Practice.Challenge.Challenge_39;

public class Pattern {
    public static void main(String[] args) {
    printPatterns();
    }
    public static void printPatterns() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while ( i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
