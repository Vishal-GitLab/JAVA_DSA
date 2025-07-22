package src.OOPs.AbstractionAndPolymorhim.Abstraction;

public abstract class Vehicle implements Transport {               // abstract karne se ye class sirf inherit ki jaye bas , instance na ki jaye
    private int noOfTires;

    public abstract void makeStartSound();


    @Override
    public void getSetGo() {
        System.out.println("going to place......");
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute() {
        System.out.println("going....");
    }

}
