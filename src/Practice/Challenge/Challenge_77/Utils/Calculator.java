package src.Practice.Challenge.Challenge_77.Utils;

import src.Practice.Challenge.Challenge_77.Geometry.Circle;
import src.Practice.Challenge.Challenge_77.Geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(6);
        Rectangle rec = new Rectangle(5,6);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rec.breadth * rec.length;

        System.out.printf("Area of the Circle: %f ,  Area of the Rectangle: %f", cirArea , rectArea);
    }
}
