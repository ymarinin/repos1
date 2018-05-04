public class Car {
    public static String Name = "Car";
    private double speed;

    public Car () {

    }

    public void startmotor () {
        System.out.println("Motor start work");
    }

    public void stopmotor () {
        System.out.println("Motor stop work");
    }

    public void startmove () {
        System.out.println( Car.Name + " start move");
    }

    public void stopmove () {
        System.out.println( Car.Name + " stop move");
    }

    public double getSpeed () {
        return speed;
    }

    public void setSpeed (double speed) {
        this.speed=speed;
    }
}
