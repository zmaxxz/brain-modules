package ua.zp.bainacad.lab12.packages.transport;

public class Passport {
    private String carManufacturer;
    private String carModel;
    private String color;
    private String registrationNumber;
    private String ownerName;

    public Passport(String carManufacturer, String carModel, String color, String registrationNumber, String ownerName) {
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public Passport changeOwner(String newOwner) {
        return PassportUtil.changeOwner(this, newOwner);
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

}
