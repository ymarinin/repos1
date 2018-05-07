public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int c ;// count of calls
    protected int s ; // count of sms
    public Phone() {
        System.out.println("Phone constructor");
    }
    public boolean isTouch() {
        return touch;
    }
    public boolean isHasWifi() {
        return hasWifi;
    }
    public int getScreenSize() {
        return screenSize;
    }
    public void call(String number) {
        System.out.println("Phone class is calling " + number);
    }
    public abstract void sendSMS(String number, String message); {
    }
    public int getC () {
        return c;
    }
    public int getS () {
        return s;
    }
}
