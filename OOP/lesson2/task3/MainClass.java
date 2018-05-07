public class MainClass {
    public static void main(String[] args) {
// Phone p = new Phone(); ошибка т.к. класс абстрактный
        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");
        System.out.println("Nokia3310 makes " + nokia.c + " calls " + "and sended " + nokia.s + " SMS");
        System.out.println("----------------------------------");
        IPhone iphone = new IPhone();
        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");
        System.out.println("IPhone makes " + iphone.c + " calls " + "and sended " + iphone.s + " SMS");
        System.out.println("----------------------------------");
        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone5 screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.call("123-45-67");
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");
        System.out.println("IPhone makes " + iphone5.c + " calls " + "and sended " + iphone5.s + " SMS");
        System.out.println("----------------------------------");
        SamsungS4 samsungS4 = new SamsungS4();
        System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
        samsungS4.sendSMS("444-45-67", "text message");
        samsungS4.sendSMS("444-45-67", "text message");
        System.out.println("SamsungS4 makes " + samsungS4.c + " calls " + "and sended " + samsungS4.s + " SMS");
    }
}
