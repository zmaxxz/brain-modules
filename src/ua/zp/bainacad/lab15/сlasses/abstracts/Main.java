package ua.zp.bainacad.lab15.сlasses.abstracts;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Sony", 133, 1, "TFT");
        mobile.call();
        mobile.powerOff();
        System.out.println();

        DialPhone dialPhone = new DialPhone("Philips", 222, true);
        dialPhone.call();
        dialPhone.autoAnswer();
        dialPhone.powerOff();
        System.out.println();

        SmartPhone smartPhone = new SmartPhone("Samsung", 321, 2, "AmoLed", "Android");
        smartPhone.call();
        smartPhone.runApp();
        smartPhone.powerOff();
        System.out.println();

        Oven oven = new Oven();
        oven.initTimer(10);
        oven.powerOff();
        System.out.println();

        Multicooker multicooker = new Multicooker();
        multicooker.switchProgram(3);
        multicooker.powerOff();
        System.out.println();

        allDevicesPowerOff(multicooker, smartPhone, dialPhone, oven, mobile);
    }

    public static void allDevicesPowerOff(AbstractDevice... devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
    }
}
