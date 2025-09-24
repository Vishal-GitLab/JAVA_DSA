package src.Practice.Coding.Ineritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.Balance();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.Balance();
//        motorCycle.speed();
    }
}
