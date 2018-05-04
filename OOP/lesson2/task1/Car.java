public class Car {
    private String name;
    private Engine engine; // мотор
    private Climate climate = new Climate(); // климат-контроль

    public Car (String name) {
        this.name = name;
        engine = new Engine(0, 1.6);
    }

    public Car (String name, double mileage, double volume) {
        this.name =name;
        engine = new Engine(mileage, volume);
    }

    public String getName () {
        return name;
    }

    public double getMileage () {
        return engine.getMileage();
    }

    public double getVolume () {
        return engine.getVolume();
    }

    public double getConsumption () {
        return engine.getConsumption();
    }

    public double getFuelspent () {
        return engine.getMileage()*engine.getConsumption();
    }

    //завести мотор
    public void turnOn () {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    // заглушить мотор
    public void turnOff () {
        engine.turnOff();
        climate.turnOff();
    }

    // установить скорость
    public void start (int speed, double hours) {
        if (engine.isStarted()) { //ешё не заведен мотор
        // пройдена дистанция
            double distance = hours * speed;
                engine.addMileage(distance);
            }
        }

    }

