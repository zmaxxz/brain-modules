package ua.zp.bainacad.lab12.packages.citizen;

import java.util.Date;

/**
 * Класс <b>Passport</b> позволяе создать объект описывающий паспортные данные человека
 *
 * @author Максим Деенков
 * @version 1.0
 */
public class Passport {
    /**
     * Серия-номер паспорта
     */
    private String id;
    /**
     * Имя
     */
    private String firstName;
    /**
     * Фамилия
     */
    private String secondName;
    /**
     * Деньрождения
     */
    private final Date birthday;
    /**
     * Принадлежность к полу (мужчина = true / женщина = false)
     */
    private boolean isMale;
    /**
     * Номер паспорта супруга
     */
    private String spouseId;

    /**
     * Конструктор нового обЪекта <b>Passport</b> с параметрами.
     *
     * @param id         серия-номер паспорта
     * @param firstName  имя
     * @param secondName фамилия
     * @param birthday   деньрождения типа {@link java.util.Date}
     * @param isMale     принадлежность к полу
     */
    public Passport(String id, String firstName, String secondName, Date birthday, boolean isMale) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.isMale = isMale;
    }

    public String getId() {
        return id;
    }

    public void setSpouseId(String spouseId) {
        this.spouseId = spouseId;
    }

}
