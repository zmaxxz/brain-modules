package ua.zp.bainacad.lab19;

import ua.zp.bainacad.lab19.exceptions.PowerOnOffException;
import ua.zp.bainacad.lab19.interfaces.Powered;

public class GameConsole implements Powered {
    private String brand;
    private String model;
    private String serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;

    public GameConsole(String brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(this.brand, 1);
        this.secondGamepad = new Gamepad(this.brand, 2);

    }

    public void loadGame(Game game) {
        System.out.printf("Игра %s загружается\n", game.getName());
        this.activeGame = game;
    }

    public void playGame() {
        System.out.println("Играем в " + this.activeGame.getName());
        if (this.firstGamepad.isOn) {
            this.firstGamepad.chargeLevel -= 10;
            System.out.printf("Заряд батареи firstGamepad - %.1f\n", this.firstGamepad.chargeLevel);
            if (this.firstGamepad.chargeLevel == 0) {
                this.firstGamepad.powerOff();
            }
        }
        if (this.secondGamepad.isOn) {
            this.secondGamepad.chargeLevel -= 10;
            System.out.printf("Заряд батареи secondGamepad - %.1f\n", this.secondGamepad.chargeLevel);
            if (this.secondGamepad.chargeLevel == 0) {
                this.secondGamepad.powerOff();
            }
        }
        System.out.println();
    }

    private void checkConnectedNumber() {

        if (!this.firstGamepad.isOn) {                      // if firstGamepad is off
            if (this.secondGamepad.isOn) {                  // and secondGamepad is on
                this.secondGamepad.connectedNumber = 1;     // secondGamepad becomes the main
            } else {

            }
        } else {                                                        // if firstGamepad is on
            this.secondGamepad.connectedNumber = 2;         // secondGamepad becomes secondary, even if turned off
        }
    }


    @Override
    public void powerOn() throws PowerOnOffException {
        try {
            if (this.isOn == true) {
                throw new PowerOnOffException("Выключаем консоль");
            }
            this.isOn = true;
            System.out.println("Консоль включается");
        } catch (PowerOnOffException e) {
            this.powerOff();
        }
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("Консоль выключается");
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    class Gamepad implements Powered {
        private String brand;
        private String consoleSerial;
        private int connectedNumber;
        private Color color;
        private double chargeLevel = 100.0;
        private boolean isOn;

        public Gamepad(String brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            this.consoleSerial = serial;
        }

        @Override
        public void powerOn() {
            this.isOn = true;
            GameConsole.this.checkConnectedNumber();
            System.out.printf("Джойстик %d включается.\n", this.connectedNumber);
            GameConsole.this.powerOn();
            System.out.printf("Заряд батареи %.1f%% .\n\n", this.chargeLevel);
        }

        @Override
        public void powerOff() {
            this.isOn = false;
            System.out.printf("Джойстик %d выключается.\n\n", this.connectedNumber);
            GameConsole.this.checkConnectedNumber();
        }
    }


}
