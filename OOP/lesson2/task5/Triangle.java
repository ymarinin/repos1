public class Triangle extends Figure {
    private double height, width;

    public Triangle (double h, double w) {
        name = "Triangle";
        height = h;
        width = w;
    }
    @Override
    public double getSquare () {
        return height*width/2;
    }
}
