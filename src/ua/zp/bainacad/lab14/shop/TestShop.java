package ua.zp.bainacad.lab14.shop;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.position.Cashier;
import ua.zp.bainacad.lab14.employee.position.Guard;
import ua.zp.bainacad.lab14.employee.position.Manager;
import ua.zp.bainacad.lab14.human.Human;


// Статический импорт статического метода addObjectToArray,
// позволяющий пересоздать массив объектов передаваемого класса, добавив новый элемент того же класса или дочернего

import java.util.ArrayList;

import static ua.zp.bainacad.MyUtil.*;

public class TestShop {
    public static void main(String[] args) {

        printArrayList(humans);
        printArrayList(shop.getEmployees());
        printArrayList(shop.getCustomers());
        printArrayList(humansLine);


        shop.toOpen(humansLine);
        humansLine.add(humans.get(2));
        shop.toOpen(humansLine);
        humansLine.add(humans.get(1));
        shop.toOpen(humansLine);
    }

    /**
     * Создаем и инициализируем массив объектов класса {@link Human}, которым вдальнейшем будем пользоваться
     * для инициализации различных дочерних классов
     */

    static  ArrayList <Human> humans =new ArrayList<>();
    static {
        humans.add(new Human("Всех Доставалкин", "111"));
        humans.add(new Human("Лишнего Насчиталкин", "222"));
        humans.add(new Human("Trerminator T1000", "333"));
        humans.add(new Human("Туалетную Бумагу Искалкин", "444_444"));
        humans.add(new Human("Гречку Покупалкин", "555_555"));
        humans.add(new Human("Без Маски Приходилкин", "666_666"));
    }

    /**
     * Создаем магазин, заполняя его работниками и клиентами
     */
    static Shop shop = new Shop("Продукты", "бул.Шевченко, 23");
    static {
        shop.getEmployees().add(new Guard(humans.get(2)));
        shop.getEmployees().add(new Manager(humans.get(0)));
        shop.getEmployees().add(new Cashier(humans.get(1)));

        shop.getCustomers().add(new Customer(humans.get(3)));
        shop.getCustomers().add(new Customer(humans.get(5)));
    }

    /**
     * Создаем очередь людей перед магазином
     */
    static ArrayList <Human> humansLine = new ArrayList <>();
    static {
        humansLine.add(humans.get(3));
        humansLine.add(humans.get(0));
        humansLine .add(humans.get(4));
        humansLine.add(humans.get(5));
    }
}
