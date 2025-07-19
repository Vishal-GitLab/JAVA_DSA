package src.OOPs;

public class Car {

    public String color;
    public String model;
    private double fuelLevel;
    // private cheezo ko ,, jo jis class ke andar hai vahi use kar sakti hai , chahe vo methods bnaye ya constructor bnaye
    private long costOfPurchase;


    public Car() {                  // using the defaukt constructor

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}
