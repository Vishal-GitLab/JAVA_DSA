package src.Practice.Coding.Ineritance;

public class TwoWheeler extends Vehicle {

    public TwoWheeler() {
        setNoOfTires(2);
        noOfTires = 4;
    }


    public void Balance() {
        System.out.println("I am balancing of two tires");
    }
}
