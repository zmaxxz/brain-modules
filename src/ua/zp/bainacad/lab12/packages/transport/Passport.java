package ua.zp.bainacad.lab12.packages.transport;

/**
 * Класс <b>Passport</b> позволяе создать объект описывающий паспортные данные автомобиля
 *
 * @author Максим Деенков
 * @version 1.0
 */
public class Passport {
    /**
     * Производитель
     */
    private String carManufacturer;
    /**
     * Модель
     */
    private String carModel;
    /**
     * Цвет
     */
    private String color;
    /**
     * регистрационный номер
     */
    private String registrationNumber;
    /**
     * Владелец автомобиля
     */
    private String ownerName;

    /**
     * Конструктор нового обЪекта <b>Passport</b> с параметрами.
     *
     * @param carManufacturer    призводитель
     * @param carModel           модель
     * @param color              цвет
     * @param registrationNumber регистрационный номер
     * @param ownerName          владелец
     */
    public Passport(String carManufacturer, String carModel, String color, String registrationNumber, String ownerName) {
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    /**
     * Метод обращается к статическому методу утилиты {@link PassportUtil#changeOwner} с модификатором доступа <b>package-private (default)</b>
     *
     * @param newOwner новый владелец
     * @return {@link Passport} (паспортные данные автомобиля)
     */
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
