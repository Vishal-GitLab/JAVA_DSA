package src.OOPs.AbstractionAndPolymorhism.Polymorhism;

 class Car implements Vehicle {

     public int noOfDoors() {
        return 5;
    }

     @Override
     public void start() {
         System.out.println("Car is starting.. ");
     }

}
