package src.Practice.Coding.Ineritance.Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Ankit",18, "001");
        Person person2 = new Person("Ankit", 18,"001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
