package src.Practice.Coding.ControlStatementMathAndString;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram  ", "Shyam  " , "Shita" ,
        };

        printForEachArray(array);

    }

    public static void printForEachArray(String[] array) {
        for (String name: array ) {
            System.out.println(name);
        }
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
