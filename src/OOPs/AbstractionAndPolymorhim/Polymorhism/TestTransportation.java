package src.OOPs.AbstractionAndPolymorhism.Polymorhism;

public class TestTransportation {
    public static void main(String[] args) {

        Car c = new Car();
      //  Vehicle v = new Vehicle();
        Plane p = new Plane();


        // castTest(v);
        castTest(c);
        castTest(p);

        //castTest(c);
        //castTest(v);

        // Vehicle vCar = new Car();     //    kyunki Car vehicle ka part hai
        // Car cVehicle = new Vehicle();

        //Object ref = new Car();          // object ke refernce me hm kisi ko dal sakte hai chahe vo Car ya Vehicle ho

    }
    private static void castTest(Vehicle veh) {    // reference vehicle hona chaiye bas ye vehicle ke upar chalta hai
//        Car cVehicle = (Car) veh;
        //veh.noOfDoors();                  // hm vo property aur method access kar sakte hai jo hmare refrence ke pass ho
//        cVehicle.starts();
        veh.start();             // calling is different based on object ( c and p )
//        cVehicle.noOfDoors();
    }
}
