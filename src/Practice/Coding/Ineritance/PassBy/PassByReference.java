package src.Practice.Coding.Ineritance.PassBy;

public class PassByReference {
    public static void main(String[] args) {
        // Create a new Point object with initial coordinates (2,3)
        Point first = new Point(2,3);
        // Print the Point object using toString()
        // Output: First: Point {x = 2, y = 3}
        System.out.println("First: " + first);
        // Pass the Point object to the Move() method
        Move(first);
        // After Move() modifies x and y, we print again
        // Output: Point {x = 3, y = 4}
        System.out.println(first);


    }

    public static void Move(Point p){
        // Increase the x coordinate by 1
           p.x++;
        // Increase the y coordinate by 1
           p.y++;
        // Print the updated Point
        // Example: Point {x = 3, y = 4}
        System.out.println(p);

    }


    // Inner static class Point
    public static class Point {
        int x;          // field to hold the x-coordinate
        int y;          // field to hold the y-coordinate

        // Constructor to initialize x and y
        public Point(int x, int y ) {
            this.x = x;
            this.y = y;
        }



        // Overriding toString() so that printing the object gives readable output
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Point {");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append("}");
        return sb.toString();
    }
    }
}
