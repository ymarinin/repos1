public class Rectangle extends Figure {
    private double height, width;

    public Rectangle (double h, double w) {
        name = "Rectangle";
        height = h;
        width = w;
    }
    @Override
    public double getSquare () {
        return width*height;
    }

}
