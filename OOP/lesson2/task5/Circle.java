public class Circle extends Rectangle {
    private double radius;

    Circle () {
        name = "Circle";
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
