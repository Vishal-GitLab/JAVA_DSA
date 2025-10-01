package src.Practice.Coding.Polymorphism;

public class Car implements Vehicle{
    private int NoOfDoors() {
        return 5;
    }
    @Override
    public void start() {
        System.out.println("Car is starting..");
    }
}
