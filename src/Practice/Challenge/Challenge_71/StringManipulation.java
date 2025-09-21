package src.Practice.Challenge.Challenge_71;

public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Vishal";
        String lastName = "Chaurasiya";


        // .concat() is a method in Java that joins (concatenates) two strings
        String fullName = firstName
                .concat(" ")    // add  space " "
                .concat(lastName);    // add last name
        System.out.println(fullName);
    }
}
