package src.OOPs.AbstractionAndPolymorhim.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        // Vehicle veh = new Vehicle(2);          // vehicle ko ham direct object nahi bna sakte hai kyunki hmari parent vali class abstract hai
        Car car = new Car();
        car.commute();
        car.makeStartSound();                     // car ke object ko bhi call kar sakte hai
    }
}
