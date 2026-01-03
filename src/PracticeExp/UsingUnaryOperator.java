package src.PracticeExp;

public class UsingUnaryOperator {
    public static void main(String[] args) {
        int p= 5;
        int q=-p;
        System.out.println(q);
        int r=-q;
        System.out.println(r);

        int j=45;
        j = j+1;
        System.out.println(j);
        j += 1;
        System.out.println(j);


        System.out.println("Increment");
        int s=5;
        System.out.println(s++);
        System.out.println(s);

        System.out.println(s--);
        System.out.println(s);
    }
}
