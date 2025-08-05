package src.Practice.Coding;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 5;
        int y =- x;
        System.out.println(y);
        int z =- y;
        System.out.println(z);

        int a = 8;
         a = a +1;
        System.out.println(a);
        int b = a + 1;
        System.out.println(b);

        System.out.println("Watching increment");
        int p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println(p);

        System.out.println("Watching decrement");
        int q = 7;
        System.out.println(--q);
        System.out.println(q);
        System.out.println(q--);
        System.out.println(q);

    }
}
