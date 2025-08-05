package src.Practice.Coding;

public class LearningIf {
    public static void main(String[] args) {
        boolean isMaale = true;
        String name = "Vishal";

        System.out.println("before if ");
        if (isMaale) {
            System.out.println("Mr." + name);
        }
        else {
            System.out.println("Ms" + name);
        }
        System.out.println("After if");

        boolean isSeniorCitizen = false;
        boolean  isAdult = true;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else {
            System.out.println("Hello Adult");
        }
    }
}
