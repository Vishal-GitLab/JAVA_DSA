package src.ClassAndObject;

import javax.swing.*;

public class Driver {

    static int minAgeForDriving =   18;

    String name;
    int age;
    String dateOfLicence;

    public boolean isAllowedToDerive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {           //main method ko static isliye bnaya jata hai -- jo hmara jvm hai usko object na create karna npade
//        Car  myCar =  new Car();                       // new --> object creation     ,,  myCar --  Car class ka ak variable define kiya gya hai  Car() ak object hai
//                                        // Car() object ko uthakar myCar me dal deta hai ;
//        myCar.addFuel(6);
//        myCar.derive();                               // jab bhi koi property access karni hoti hai to use . lgakar method ko call kar lunga
//        myCar.derive();
//        myCar.derive();
//        myCar.addFuel(3);
//        myCar.derive();
//        System.out.println(myCar.getCurrentFuelLevel());


      //  Car swift = new Car();             // ye class nahi hai , ye constructor hai,,,      ye default constructor ke liye tha
        Car swift = new Car("Red");             // Parametrized constructor
        Car thar = new Car();
       // swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.derive();
        swift.start().derive();
        System.out.println(swift.color);

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicence = "1/Jan/2024";
//        System.out.println(minAgeForDriving);

    }
}
