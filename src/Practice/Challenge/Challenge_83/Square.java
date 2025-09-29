package src.Practice.Challenge.Challenge_83;

public class Square extends Shape {
    public final double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    public double getSideInCm() {
        return sideInCm;
    }

    @Override
    public double calculator() {
        return Math.pow(sideInCm,2);
    }
}
