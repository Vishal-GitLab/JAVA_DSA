package src.ControlsStatementMathAndString;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Vishal";
        int marks = 45;
        System.out.println("Hello " + name + ", your marks are: " + marks);

        System.out.printf("Hello %s, your marks are: %d" , name, marks);
    }
}
