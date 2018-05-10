public class Triangle extends Figure {
    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle () {
   }

    public Triangle (double side1, double side2, double side3) {
        name = "Triangle";
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1 () {
        return side1;
    }

    public void setSide1 () {
        this.side1=side1;
    }

    public double getSide2 () {
        return side2;
    }

    public void setSide2 () {
        this.side2=side2;
    }

    public double getSide3 () {
        return side3;
    }

    public void setSide3 () {
        this.side3=side3;
    }

    @Override
    public double getSquare () {
        double p = (side1 + side2 + side3)/2;
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }
}
