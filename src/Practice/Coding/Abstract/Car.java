package src.Practice.Coding.Abstract;

public class Car  extends  Vehicle{                    // Jab ek class dusri class ki properties aur methods ko use (inherit) karti hai, tab hum extends keyword lagate hain.
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrooomm");
    }
}





            //Jab ek child class (ya subclass) apne parent class (ya interface) ke method ko dobara likhti (modify / implement) hai, tab hum @Override annotation use karte hain.