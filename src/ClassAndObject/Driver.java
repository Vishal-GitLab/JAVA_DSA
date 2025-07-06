package src.ClassAndObject;

public class Driver {
    public static void main(String[] args) {
        Car  myCar =  new Car();                       // new --> object creation     ,,  myCar --  Car class ka ak variable define kiya gya hai  Car() ak object hai
                                        // Car() object ko uthakar myCar me dal deta hai ;
        myCar.addFuel(6);
        myCar.derive();
        myCar.derive();
        myCar.derive();
        myCar.addFuel(3);
        myCar.derive();
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
