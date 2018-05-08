public class Rectangle extends Triangle {
    private double height;
    private double width;

    Rectangle () {
        name = "Rectangle";
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
