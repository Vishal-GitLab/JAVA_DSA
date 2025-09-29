package src.Practice.Challenge.Challenge_83;

public class Circle extends  Shape{
    private final double radiusInCm;


    public Circle(double radiusInCm) {
        this.radiusInCm = radiusInCm;
    }

    public double getRadiusInCm() {
        return radiusInCm;
    }

    @Override
    public double calculator() {
        return Math.PI * Math.pow(radiusInCm,2);
    }
}
