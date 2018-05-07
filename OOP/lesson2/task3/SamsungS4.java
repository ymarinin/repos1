public class SamsungS4 extends Samsung {
    public SamsungS4() {
        System.out.println("SamsungS4 constructor");
        screenSize = 5;
        imei = "222222";
        c = 0;
        s = 0;
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("SamsungS4 class is sending sms " + "Hello " + message + " to " + number);
    }
}
