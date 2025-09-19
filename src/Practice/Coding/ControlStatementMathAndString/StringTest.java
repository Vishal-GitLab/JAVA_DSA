package src.Practice.Coding.ControlStatementMathAndString;

public class StringTest {
    public static void main(String[] args) {

        StringBuilder jio =  new StringBuilder("First"); // Create a StringBuilder object named 'jio' initialized with the string "First"

          // Append the integer 46 to the current content of 'jio'
         // StringBuilder automatically converts the integer to a string
        jio.append(46);


        jio.append(", Now this is the"); // Append the string ", Now this is the" to 'jio'

        // Append the integer 90 to 'jio' (converted to string)
        jio.append(90);
        System.out.println(jio);
    }
}
