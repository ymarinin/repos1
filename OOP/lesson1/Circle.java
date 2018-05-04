public class Circle {
    public static final String Name = "Circle";

    private double radius;

    public Circle () {

    }

    public double getRadius (){
        return radius;
    }

    public void setRadius (double radius) {
        this.radius=radius;
        if (radius < 0) {
            System.out.println("error");
            System.exit(0);
        }
    }

    public double Square (double radius) {
        return Math.PI*radius*radius;
    }
}
