package ua.zp.bainacad.lab19;

public class GameConsole {
    private String brand;
    private String model;
    private String serial;
    private Object firstGamepad;
    private Object secondGamepad;
    private boolean isOn;

    public GameConsole(String brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(this.brand, 1);
        this.secondGamepad = new Gamepad(this.brand, 2);
    }

    class Gamepad {
        String brand;
        String consoleSerial;
        int connectedNumber;
        Color color;
        double chargeLevel;
        boolean isOn;

        public Gamepad(String brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;
        }
    }






}
