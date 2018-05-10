public class Rectangle extends Triangle {
    private double height;
    private double width;

    public Rectangle () {
    }

    public Rectangle (double height, double width) {
        name = "Rectangle";
        this.height=height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare () {
        return width*height;
    }

}
