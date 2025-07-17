package src.ProgramingChallenge_2;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Vishal";
        String lastName = "Chaurasiya";
        String fullName = firstName.concat(" ").concat(lastName);            // concat ---->> meri vali cheez ko bad me add kar do
      //  System.out.println(fullName);

        System.out.println(fullName.toUpperCase());                           // capital me print krane ke liye toUpperCase ka use karenge
    }
}
