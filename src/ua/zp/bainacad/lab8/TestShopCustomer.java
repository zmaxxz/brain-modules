package ua.zp.bainacad.lab8;


import java.util.Arrays;

public class TestShopCustomer {
    public static void main(String[] args) {

        // Инициализируем покупателя
        ShopCustomer shopCustomer = new ShopCustomer();
        shopCustomer.setShopCustomerName("Сергей");
        shopCustomer.setShopCustomerPhone("06712345678");
        shopCustomer.setDiscount(false);

        // Выводим информавцию о покупателе
        System.out.println("Имя класса: " + ShopCustomer.CLASS_NAME);
        System.out.println("shopCustomerName = " + shopCustomer.getShopCustomerName());
        System.out.println("shopCustomerPhone = " + shopCustomer.getShopCustomerPhone());
        System.out.println("isDiscount = " + shopCustomer.isDiscount());
        System.out.println("items = " + shopCustomer.getItems());
        System.out.println();

        // Добавляем товар в корзину
        shopCustomer.addItem("");
        shopCustomer.addItem("Item 1");
        shopCustomer.addItem("Item 2");
        shopCustomer.addItem("Item 3");
        shopCustomer.addItem("Item 4");

        // Проверяем бонусы
        shopCustomer.viewBonus();
        shopCustomer.addBonus("Скидка на овощи 5%");
        shopCustomer.addBonus("Скидка на алкоголь 2%");
        shopCustomer.viewBonus();

        // Завершаем покупку
        shopCustomer.purchaseGoods();
    }
}
