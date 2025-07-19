package src.OOPs.Coding;

import src.OOPs.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Maruti",
                3, 8000);
        car.setColor("Blue");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}
