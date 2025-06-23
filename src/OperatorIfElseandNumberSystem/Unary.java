package src.OperatorIfElseandNumberSystem;

public class Unary {
    public static void main(String[] args) {
        int x=5;
        int y=-x;
        System.out.println(y);
        int z=-y;
        System.out.println(z);

        int a=8;
        a = a+1;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        System.out.println("Watching the increment ");
        int p=5;
        System.out.println(p++);  // p++ ki value pahle istemal kar lijiye baad me increment kr dega
        System.out.println(p);

        System.out.println(++p);  // pahle increment karo baad me istemal karo
        System.out.println(p);


        int q=10;
        System.out.println(--q); // pahle value evalute kariye baad me istemal kijiye  vlaue 9 aayegi
        System.out.println(q);    // yaha bhi value bhi 9 aayegi

        System.out.println(q--);    //  pahle istemal kijie baaad me negative kijiye
        System.out.println(q);
    }

}
