package src.Practice.Coding.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane();

        castTest(car);
        castTest(plane);

    }
        private static void castTest (Vehicle veh){
            veh.start();
        }
    }

