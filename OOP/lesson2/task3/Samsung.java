public class Samsung extends Phone {
    protected String imei;
    public Samsung() {
        System.out.println("Samsung constructor");
        touch = true;
        hasWifi = true;
        screenSize = 3;
        c = 0;
        s = 0;
    }
    @Override
    public void call(String number) {
        System.out.println("Samsung class is calling " + number);
        c++;
    }
    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung class is sending sms " + message + " to " + number);
        s++;
    }
}
