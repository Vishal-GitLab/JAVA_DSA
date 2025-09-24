package src.Practice.Coding.Ineritance;

public class Vehicle {
    int noOfTires;

    public  void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;

    }
     @Override
    public  String toString() {
        return "No of tires: " + noOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B %d\n tires , " + noOfTires );
    }
}
