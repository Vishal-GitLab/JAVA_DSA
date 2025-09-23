package src.Practice.Challenge.Challenge_75;

public class ArrayToString {
    public static void main(String[] args) {

        String[]  arr = new String[] { "This",
               "College", "is",  "the", "best", "College", "compare", "than",
                "other", "College"};

        StringBuilder sb = new StringBuilder();

        for (String str: arr){
            sb.append(str).append(" ");

        }
        System.out.println(sb);
    }

}
