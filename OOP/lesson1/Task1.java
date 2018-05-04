import java.util.Scanner;

public class Task1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, input radius(double) of " + Circle.Name + ":");
        double r = scan.nextDouble();
        Circle c = new Circle();
        c.setRadius(r);
        System.out.println("Square of the " + Circle.Name + " is : " + c.Square(c.getRadius()));
    }
}
