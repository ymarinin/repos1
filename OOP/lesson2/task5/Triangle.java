public class Triangle extends Figure {
    private double height ;
    private double width ;

    Triangle () {
        name = "Triangle";
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare () {
        return height*width/2;
    }
}
