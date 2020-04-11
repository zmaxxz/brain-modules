package ua.zp.bainacad.lab8;

/**
 * class ShopCustomer - описание клиента магазина
 * <p>
 * поля класса:
 * shopCustomerName - имя клиента
 * shopCustomerPhone - контактный телефон клиента
 * isDiscount - есть ли дисконт
 * items - список покупок
 */

public class ShopCustomer {
    public static final String CLASS_NAME = "ShopCustomer";
    private String shopCustomerName;
    private String shopCustomerPhone;
    private boolean isDiscount;
    private String items;
    private String bonus;

    // Метод добавление единицы товара в корзину
    public void addItem(String item) {
        if (item == null || item == "") {
            System.out.println("Немогу добавить пустоту");
            return;
        }
        if (items != null) {
            items += item + "\n";
        } else {
            items = item + "\n";
        }
        System.out.println("Добавляем товар в корзину - " + item);
    }

    // Метод позволяющий просмотреть активные бонусы
    public void viewBonus() {
        if (!isDiscount) {
            System.out.println("Нет активных бонусов");
            return;
        }
        System.out.println("Активные бонусы:\n" + bonus);
    }

    // Метод добавляющий бонус
    public void addBonus(String bonus) {
        if (bonus == null || bonus == "") {
            System.out.println("Бонус не добавлен");
            return;
        }
        if (this.bonus != null) {
            this.bonus += bonus + "\n";
        } else {
            this.bonus = bonus + "\n";
        }
        System.out.println("Добавляем новый бонус - " + bonus);
        this.isDiscount = true;
    }

    public void purchaseGoods() {
        if (items == null) {
            System.out.println("Корзина пуста, выберете товар");
            return;
        }
        System.out.println("Создаем чек по списку товара");
        System.out.println(items);
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

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
}

