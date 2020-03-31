package ua.zp.bainacad.lab5;

/**
 * class PShopCustomer - описание клиента магазина
 *
 * поля класса:
 *     shopCustomerName - имя клиента
 *     shopCustomerPhone - контактный телефон клиента
 *     isDiscount - есть ли дисконт
 *     [] items - список покупок
 */

public class PShopCustomer {
    private static final String className = "ShopCustomer";
    private String shopCustomerName;
    private String shopCustomerPhone;
    private boolean isDiscount;
    private String[] items;

    public static String getClassName() {
        return className;
    }

    public String getShopCustomerName() {
        return shopCustomerName;
    }

    public void setShopCustomerName(String shopCustomerName) {
        this.shopCustomerName = shopCustomerName;
    }

    public String getShopCustomerPhone() {
        return shopCustomerPhone;
    }

    public void setShopCustomerPhone(String shopCustomerPhone) {
        this.shopCustomerPhone = shopCustomerPhone;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }
}
