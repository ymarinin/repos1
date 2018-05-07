public class Circle extends Figure {
    private double radius;

    public Circle (double r) {
        name = "Circle";
        radius = r;
    }
    @Override
    public double getSquare () {
        return radius*radius*Math.PI;
    }
}
