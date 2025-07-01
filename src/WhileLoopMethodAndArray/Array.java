package src.WhileLoopMethodAndArray;

public class Array {
    public static void main(String[] args) {
 //       int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 3;
//        myArr[2] = 9;
//        myArr[3] = 8;
//        myArr[4] = 38;


       int[] myArr = {98, 3, 9, 8, 38};


//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
          // Array Traversal ,,,,,       traversal --->>  pure cheez ka ak baar me hi visit karna
        int index = 0;
        while (index < 5) {
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr =  new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);


    }
}
