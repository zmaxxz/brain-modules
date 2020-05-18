package ua.zp.bainacad.lab19;

import ua.zp.bainacad.lab19.exceptions.PowerOnOffException;
import ua.zp.bainacad.lab19.interfaces.Powered;

public class GameConsole implements Powered {
    private String brand;
    private String model;
    private String serial;
    private Object firstGamepad;
    private Object secondGamepad;
    private boolean isOn;
    private Game activeGame;

    public GameConsole(String brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(this.brand, 1);
        this.secondGamepad = new Gamepad(this.brand, 2);

    }

    public void loadGame(Game game){
        System.out.printf("Игра %s загружается\n",game.getName());
        this.activeGame=game;
    }

    public void playGame(){
        System.out.println("Играем в "+this.activeGame.getName());
        if(((Gamepad) this.firstGamepad).isOn){
            ((Gamepad) this.firstGamepad).chargeLevel-=10;
            System.out.printf("Заряд батареи firstGamepad - %.1f\n",((Gamepad) this.firstGamepad).chargeLevel);
            if(((Gamepad) this.firstGamepad).chargeLevel==0){
                ((Gamepad) this.firstGamepad).powerOff();
            }
        }
        if(((Gamepad) this.secondGamepad).isOn){
            ((Gamepad) this.secondGamepad).chargeLevel-=10;
            System.out.printf("Заряд батареи secondGamepad - %.1f\n",((Gamepad) this.secondGamepad).chargeLevel);
            if(((Gamepad) this.secondGamepad).chargeLevel==0){
                ((Gamepad) this.secondGamepad).powerOff();
            }
        }
        System.out.println();
    }

    private void checkConnectedNumber() {

        if (!((Gamepad) this.firstGamepad).isOn) {                      // if firstGamepad is off
            if (((Gamepad) this.secondGamepad).isOn) {                  // and secondGamepad is on
                ((Gamepad) this.secondGamepad).connectedNumber = 1;     // secondGamepad becomes the main
            } else {

            }
        } else {                                                        // if firstGamepad is on
            ((Gamepad) this.secondGamepad).connectedNumber = 2;         // secondGamepad becomes secondary, even if turned off
        }
    }


    @Override
    public void powerOn() throws PowerOnOffException {
        try {
            if (this.isOn == true) {
                throw new PowerOnOffException();}
            this.isOn = true;
            System.out.println("Консоль включается");
        }catch (PowerOnOffException e){
            this.powerOff();
        }
    }

    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println("Консоль выключается");
    }


    public Object getFirstGamepad() {
        return firstGamepad;
    }

    public Object getSecondGamepad() {
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
