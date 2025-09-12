package src.Practice.Coding.ClassAndObject;

public class Driver {
    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicence;


    public boolean isAllowedToDriving() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {


        Car swift = new Car("red");
        Car thar = new Car();

        swift.start().derive();
        System.out.println(swift.color);
    }


}
