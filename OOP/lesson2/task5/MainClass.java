public class MainClass {
    public static void main(String[] args) {
        Triangle tr =new Triangle(4.5, 5.6, 7.8);
        Rectangle rec = new Rectangle(4.5, 5.6);
        Circle c = new Circle(7.8);
        System.out.println(tr.name + " has square " + tr.getSquare());
        System.out.println(rec.name + " has square " + rec.getSquare());
        System.out.println(c.name + " has square " + c.getSquare());
    }
}
