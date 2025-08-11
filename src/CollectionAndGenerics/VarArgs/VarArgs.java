package src.CollectionAndGenerics.VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5 ));
        System.out.println(sum(4,5,6));      // chahe jitna argu pass kar sakte hai
        System.out.println(sum(4,5,6,7,8));
    }

    public static int sum( int first , int second, int... a) {      // first sur second number add karega uske baad a ke digit add karega
        int sum = 0;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }


//    public static int sum(int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum +=i;
//        }
//        return sum;
//    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
