package src.ProgramingChallenge_3.Challenge83;

public class Circle extends Shape {
    private final double radiusInCms;         // constructor me hi change kar rhe the iska setter nahi bna rhe the isliye hmko final use karna pda


    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
