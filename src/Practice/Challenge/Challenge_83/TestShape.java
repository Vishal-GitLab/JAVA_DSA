package src.Practice.Challenge.Challenge_83;

public class TestShape {
    public static void main(String[] args) {

        Circle circle = new Circle(2);
        Square square = new Square(5);

        System.out.printf("Area of circle %5.2f\n " , circle.calculator());
        System.out.printf("Area of square %5.2f\n", square.calculator());
    }
}
