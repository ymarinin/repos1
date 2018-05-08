public class MainClass {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        double ht = 4.5;
        double wt = 3.4;
        tr.setHeight(ht);
        tr.getHeight();
        tr.setWidth(wt);
        tr.getWidth();
        Rectangle rec = new Rectangle();
        double hr = 7.5;
        double wr = 8.4;
        rec.setHeight(hr);
        rec.getHeight();
        rec.setWidth(wr);
        rec.getWidth();
        Circle c = new Circle();
        double r = 7;
        c.setRadius(r);
        c.getRadius();
        System.out.println(tr.name + " has square " + tr.getSquare());
        System.out.println(rec.name + " has square " + rec.getSquare());
        System.out.println(c.name + " has square " + c.getSquare());
    }
}
