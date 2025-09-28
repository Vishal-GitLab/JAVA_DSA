package src.Practice.Coding.Abstract;


// Vehicle ek abstract class hai jo Transport interface ko implement karti hai
public abstract class Vehicle implements Transport {
    // private field jo batata hai vehicle me kitne tires hain
    private int noOfTires;


    // abstract method (iska implementation child classes denge)
    // har vehicle ka start sound alag hoga
    public abstract void makeStartSound();


    // yeh method Transport interface ke ek method ko override karta hai
    // jab bhi vehicle chalega, yeh message print karega
    @Override
    public void getSetGo() {
        System.out.println("going to place.....");
    }

    // Constructor jo noOfTires ko initialize karega
    public Vehicle(int noOfTires) {
        this.noOfTires =  noOfTires;
    }


    // getter method (noOfTires ka value return karega)
    public int getNoOfTires() {
        return noOfTires;
    }

    // setter method (noOfTires ko update karne ke liye)
    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    // ek normal method (concrete method) jo har vehicle me same chalega
    public void  Commute() {
        System.out.println("Chalo re");
    }
}
