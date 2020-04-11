package ua.zp.bainacad.lab7;

/**
 * class ShopCustomer - описание клиента магазина
 * <p>
 * поля класса:
 * shopCustomerName - имя клиента
 * shopCustomerPhone - контактный телефон клиента
 * isDiscount - есть ли дисконт
 * [] items - список покупок
 */

public class ShopCustomer {
    static final String className = "ShopCustomer";
    String shopCustomerName;
    String shopCustomerPhone;
    boolean isDiscount;
    String[] items;
}
