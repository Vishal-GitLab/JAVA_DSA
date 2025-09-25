package src.Practice.Coding.GetterTest;

import src.Practice.Coding.Encapsulation.GetterSetter.Car;

public class GetterTest {
    public static void main(String[] args) {                            // ham kisi package ki class ko kisi dusre class me use kar sakte hai
        Car car = new Car("Red","Maruti",8, 8000);
        car.setColor("Black");
        System.out.printf("%s %s", car.getColor(),  car.getModel());
    }
}
