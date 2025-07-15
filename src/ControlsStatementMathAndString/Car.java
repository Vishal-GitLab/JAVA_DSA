package src.ControlsStatementMathAndString;

public class Car {
         int noOfWheels;
         int noOfDoors;
         int maxSpeed;
         String name;
         String modelNumber;
         String company;


    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels  = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "My car name is: " + name;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift = new Car(4,4,120,
                "Swift", "SW876", "Maruti");
        System.out.println(swift.toString());                 // by default toString naam ka method is class me aa gya
    }




}
