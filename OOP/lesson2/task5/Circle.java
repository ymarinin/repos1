public class Circle extends Rectangle {
    private double radius;

    public Circle (double radius) {
        name = "Circle";
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare () {
        return radius*radius*Math.PI;
    }
}
