package src.PracticeExp;

public class UseForEach {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Vishal","Ankit", "Amit"
        };


        ArrayForEach(array);

    }

    public static void ArrayForEach(String[]  array) {
        for (String name : array){
            System.out.println(name);
        }
    }


    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
