package src.EncapsulationAndInheritance;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.model = "Swift";
      //  car.costOfPurchase = 75785;   // costOfPurchase hmari private hai aur hm private cheezo  ko kisi dusri class ke andar access nahi kar sakte hai
        System.out.println(car);


        Car newCar = new Car("Black","BMW",
                1,5000);
        System.out.println(newCar);


        Default def = new Default();

    }
}
