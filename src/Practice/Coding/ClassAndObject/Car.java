package src.Practice.Coding.ClassAndObject;

public class Car {
    static int noOfCarSold;
    int noOfWheel;
    String color;
    float maxSpeed;
    float fuelInLiters;
    int noOfSeats;


    static {
        noOfCarSold = 0;
        System.out.println("I am static block");
    }
    {
        noOfCarSold++;
        System.out.println("I am Init block");
    }

   Car(String color){
        noOfWheel = 4;
        this.color = color;
        maxSpeed = 150;
        fuelInLiters = 2;
        noOfSeats = 2;

   }
   Car(){
        this("Black");
        fuelInLiters = 5;
   }


   public  Car start(){
        if (fuelInLiters == 0){
            System.out.println("Car out of fuel, you do not derive");
        } else if (fuelInLiters < 5){
            System.out.println("Car is reserved mode, please refuel");
        }
        else {
            System.out.println("Car is started burrrh");
        }
        return this;
   }

public void derive() {
        fuelInLiters--;
    System.out.println("Car is derive");
}

public void addFuel(float fuelInLiters) {
        this.fuelInLiters += fuelInLiters;
}


public float getCurrentFuel(){
      return fuelInLiters;
}

@Override
    protected void finalize() throws Throwable {
    System.out.println("I am Finalize");
}







}
