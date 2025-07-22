package src.OOPs.AbstractionAndPolymorhim.Abstraction;

public class Car extends Vehicle {


    private int noOfDoors;

    public Car() {
        super(4);                 // agr parent ke pass default constructor nahi hai ,, constructor line se pahle isko call karna padta hia ,, parent ke constructor ko call karena rhega to super lgakar call karna padta hia


    }

    @Override
    public void makeStartSound() {                  // method impliments
        System.out.println("Vroommm.....");
    }
}
