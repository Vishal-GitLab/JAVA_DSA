package src.Practice.Coding.Encapsulation;

public class Car {
    public   String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;
    Car() {

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase ) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;

    }

    public String toString(){
       // Create a new StringBuilder object initialized with "Car{"
        final StringBuilder sb = new StringBuilder("Car{");
        // Append the "color" property in the format color='value'
       sb.append("color='").append(color).append('\'');
       sb.append(", model='").append(model).append('\'');
       sb.append(", fuelLevel=").append(fuelLevel);
       sb.append(", costOfPurchase=").append(costOfPurchase);
       sb.append('}');
       // Convert the StringBuilder to a String and return it
       return sb.toString();
    }
}
