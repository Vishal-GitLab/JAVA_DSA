package src.OOPs.Nested;

public class Car {

    private int noOfDoors;

    public void repair() {
        Tire t = new Tire();
    }

    // agr class ke andar class ho to hm usko public private dono bna sakte hai

    protected class Tire {             // agr hm isko non static bna denge to tabhi dusri class ke object ka use kar sakte hai
        private double width;
        private double pressure;
        private String material;

        public void inflate() {
            noOfDoors = 4;

        }
    }
}
