package src.OOPs.GetterSetter;

public class Car {
        private String color;  // public
       private String model;    // public
       private double fuelLevel;
       private long costOfPurchase;   // default

   public Car(String color, String model, double fuelLevel, long costOfPurchase) {   // agr mai constructor ko public na karu to Car ka object bahar nahi bna paunga
       this.color = color;
       this.model = model;
       this.fuelLevel = fuelLevel;
       this.costOfPurchase = costOfPurchase;
   }

    public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color= color;
        }


        public String getModel() {
            return model;
        }


}
