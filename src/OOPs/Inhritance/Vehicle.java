package src.OOPs.Inhritance;

import src.ProgramingChallenge_2.StudentToString;

public class Vehicle {
     int numberOfTires;
    // agar hm numberOfTires  ko  ko private kar dete hai to hm kisi bhi class me use nahi kar sakte hai ..,,, agr use karna hai to usko kuch is parkar se use karte hai

    // agar koi class package ke bahar to usko hm protected lga kar use karte hai

    public void setNumberOfTires(int numberOfTires) {          // setter ka use karte hai
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires " + numberOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);

    }
}
