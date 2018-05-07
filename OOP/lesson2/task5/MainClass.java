public class MainClass {
    public static void main(String[] args) {
        Triangle tr = new Triangle(3.5,4.5);
        Rectangle rec = new Rectangle(8.3, 3.7);
        Circle c = new Circle(5.6);
        System.out.println(tr.name + " has square " + tr.getSquare());
        System.out.println(rec.name + " has square " + rec.getSquare());
        System.out.println(c.name + " has square " + c.getSquare());
    }
}
