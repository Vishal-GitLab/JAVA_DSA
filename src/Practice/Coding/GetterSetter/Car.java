package src.Practice.Coding.GetterSetter;

public class Car {


    // private variables declare kiye gaye
    // Ye variables sirf isi class ke andar direct access ho sakte hain
    private String color;    // Car ka color store karega
    private String model;   // Car ka model store karega
    private double fuelLevel;     // Fuel ka level (double decimal value) store karega
    private long costOfPurchase;        // Car ki kharidne ki cost (long integer) store karega




    // Constructor banaya gaya hai (Car class ka object create hone par call hoga)
    // Constructor parameters ke values ko class ke private variables me assign karega
    public Car(String color, String model, double fuelLevel, long costOfPurchase ){
        this.color =  color;    // "this.color" matlab class ka variable hai
        this.model =  model;
        this.fuelLevel =  fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }



    // Getter method for color
    // Iske through class ke bahar se hum color ki value read kar sakte hain
    public String getColor() {
        return color;
    }

    // Setter method for color
    // Iske through class ke bahar se hum color ki value update/change kar sakte hain
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for model
    // Iske through hum model ki value read kar sakte hain
    public String getModel() {
        return model;
    }
}
