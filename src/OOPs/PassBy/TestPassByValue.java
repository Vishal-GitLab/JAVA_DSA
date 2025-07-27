package src.OOPs.PassBy;

public class TestPassByValue {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = add(x,y);
        System.out.printf("x=%d, y=%d, sum=%d", x ,y, sum);

    }
    public static int add(int a, int b) {       // jab bhi hm primitive pass karte hai java method me to unki main  ki ak copy bankar jati hai copy me kuch nhi change ho rha ho main me koi fek nahi padta hai
//        a += b;
        a = 99;
        return a;
    }
}
