package src.OOPs.Inhritance;

public class TwoWheeler extends Vehicle {                 // extends ak nya keyword hai purani vali class ki functionalty ko extends karta hai
       //TwoWheeler() {
         //  numberOfTires = 2;                         // jitni bhi Vehicle ki property hai usko Twowheelar me use kar sakte hai
          // setNumberOfTires(2);                  // isko kuc is prakar se use karte hai agr private ho to
      // }

    public TwoWheeler() {
        setNumberOfTires(2);
        numberOfTires = 4;
    }

       public void balance() {
           System.out.println("I am balancing two tires");
       }
}
