package src.OOPs.Inhritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle =  new Vehicle();
         vehicle.commute();                          // commute() ek method/function hai jo generally ye express karta hai ki: ravel from one place to another, especially on a regular basis.
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();


        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
