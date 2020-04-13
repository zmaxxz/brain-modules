package ua.zp.bainacad.lab12.packages.technics;

import java.util.Date;

/**
 * Класс <b>Passport</b> позволяе создать объект описывающий паспортные данные на бытовой техники
 *
 * @author Максим Деенков
 * @version 1.0
 */
public class Passport {
    /**
     * Производитель
     */
    private String manufacturer;
    /**
     * Категория
     */
    private String category;
    /**
     * Идентификатор модели
     */
    private String modelId;
    /**
     * Серийный номер
     */
    private String serialNumber;
    /**
     * Начальная дата гарантии типа {@link java.util.Date}
     */
    private Date warrantyStartDate;

    /**
     * Конструктор нового обЪекта <b>Passport</b> с параметрами.
     *
     * @param manufacturer производитель
     * @param category категория
     * @param modelId идентификатор модели
     * @param serialNumber серийный номер
     * @param warrantyStartDate начальная дата гарантии типа {@link java.util.Date}
     */
    public Passport(String manufacturer, String category, String modelId, String serialNumber, Date warrantyStartDate) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.modelId = modelId;
        this.serialNumber = serialNumber;
        this.warrantyStartDate = warrantyStartDate;
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }
}
