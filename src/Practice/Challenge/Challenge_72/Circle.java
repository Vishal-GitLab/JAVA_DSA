package src.Practice.Challenge.Challenge_72;

import java.util.Scanner;

public class Circle {
    double radiusInMm;

    // Constructor: initializes the circle with a radius
    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }


    // Constructor: initializes the circle with a radius
    // Formula: C = 2 *  π * r
    double getCircumference() {return 2 * radiusInMm * Math.PI;}

    // Method to calculate area of circle
    // Formula: A = π * r^2
    double getArea() { return Math.PI * Math.pow(radiusInMm , 2 );}



    // Overriding toString() method to define custom string output

    public String toString() {
        return "Circle in props: Radius in Mm: " + radiusInMm +
                ", Circumference " + getCircumference() +
                ", Area " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a radius: ");
        double radius = input.nextDouble();
        // Create a Circle object with user-input radius
        Circle circle = new  Circle(radius);
        System.out.println(circle);
    }

}
