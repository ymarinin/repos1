import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Car mycar = new Car();
        mycar.startmotor();
        mycar.startmove();
        Scanner scan = new Scanner(System.in);
        System.out.println("With what speed I must move ?? : ");
        double s = scan.nextDouble();
        mycar.setSpeed(s);
        System.out.println(Car.Name + " is moving with speed " + mycar.getSpeed() + " km/h" );
        mycar.stopmove();
        mycar.stopmotor();
    }
}
