public class Engine {
    private double mileage;
    private boolean started;
    private double volume;

    public Engine (double mileage, double volume) {
        this.mileage=mileage;
        this.volume=volume;
        }

    public double getMileage (){
         return mileage;
    }

    public double getVolume (){
        return volume;
    }

    public double getConsumption (double volume) {
        if (volume >= 0.8 && volume <= 1.1) {
            return 0.06;
        } else if (volume >= 1.2 && volume <= 1.6) {
            return 0.07;
        }  else if (volume >= 1.7 && volume <= 2.5) {
            return 0.08;
        } else if (volume >= 2.6 && volume <= 3.5) {
            return 0.12;
        } else if (volume >= 3.5 && volume <= 5.0) {
            return 0.15;
        }
        else return 0;
    }

    public double getConsumption () {
        return getConsumption(volume);
    }

     public void addMileage (double mileage){
        if (started)
            this.mileage+=mileage;
    }

    public boolean isStarted (){
        return started;
    }

    public void turnOn () {
        started=true;
    }

    public void turnOff () {
        started=false;
    }

}
