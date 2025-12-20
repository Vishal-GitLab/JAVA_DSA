package src.PracticeExp;

public class Math {
    public static void main(String[] args) {


        System.out.println(java.lang.Math.random());                  // 0 se lakar 1 tak decimal number print karta hai
        System.out.println(java.lang.Math.PI);


        for (int i = 0; i < 10; i++) {
            int random = (int) java.lang.Math.round(java.lang.Math.random() * 100);

            System.out.println(random);
        }

    }
}
