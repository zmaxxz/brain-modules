package ua.zp.bainacad.lab14.shop;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.position.Cashier;
import ua.zp.bainacad.lab14.employee.position.Guard;
import ua.zp.bainacad.lab14.employee.position.Manager;
import ua.zp.bainacad.lab14.human.Human;


// Статический импорт статического метода addObjectToArray,
// позволяющий пересоздать массив объектов передаваемого класса, добавив новый элемент того же класса или дочернего
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static ua.zp.bainacad.MyUtil.*;

public class TestShop {
    public static void main(String[] args) {

//        System.out.println(humans.toString());
        printArrayList(humans);
        printArrayList(shop.getEmployees());
        printArrayList(shop.getCustomers());
        printArrayList(humansLine);

//        humans.get(humans.)

//        shop.getEmployees()[1].sayHello();
//        System.out.println(shop.getEmployees()[1].hashCode());
//        System.out.println(getIdFromArrayObjectByObject(humansLine,shop.getEmployees()[2]));

//        shop.toOpen(humansLine);
//
//        humansLine = addObjectToArray(humansLine, humans[2]);
//
//        shop.toOpen(humansLine);
//
//        humansLine = addObjectToArray(humansLine, humans[1]);
//
//        shop.toOpen(humansLine);
//
//        ArrayList<Human> ar=new ArrayList<Human>(10);
//        for (int i = 0; i < humansLine.length; i++) {
//            ar.add(humansLine[i]);
//        }
//        ar.removeIf(Objects::isNull);
        System.out.println();

    }







    /**
     * Создаем и инициализируем массив объектов класса {@link Human}, которым вдальнейшем будем пользоваться
     * для инициализации различных дочерних классов
     */
//    static Human[] humans = new Human[0];
//
//    static {
//        humans = addObjectToArray(humans, new Human("Всех Доставалкин", "111"));
//        humans = addObjectToArray(humans, new Human("Лишнего Насчиталкин", "222"));
//        humans = addObjectToArray(humans, new Human("Trerminator T1000", "333"));
//        humans = addObjectToArray(humans, new Human("Туалетную Бумагу Искалкин", "444_444"));
//        humans = addObjectToArray(humans, new Human("Гречку Покупалкин", "555_555"));
//        humans = addObjectToArray(humans, new Human("Без Маски Приходилкин", "666_666"));
//    }

    static  ArrayList <Human> humans =new ArrayList<>();
    static {
        humans.add(new Human("Всех Доставалкин", "111"));
        humans.add(new Human("Лишнего Насчиталкин", "222"));
        humans.add(new Human("Trerminator T1000", "333"));
        humans.add(new Human("Туалетную Бумагу Искалкин", "444_444"));
        humans.add(new Human("Гречку Покупалкин", "555_555"));
        humans.add(new Human("Без Маски Приходилкин", "666_666"));

    }

    static Shop shop = new Shop("Продукты", "бул.Шевченко, 23");

    static {
        shop.getEmployees().add(new Manager(humans.get(0)));
        shop.getEmployees().add(new Cashier(humans.get(1)));
        shop.getEmployees().add(new Guard(humans.get(2)));

        shop.getCustomers().add(new Customer(humans.get(3)));
        shop.getCustomers().add(new Customer(humans.get(5)));
    }
//    static {
//        shop.addEmployee(new Manager(humans[0]));
//        shop.addEmployee(new Cashier(humans[1]));
//        shop.addEmployee(new Guard(humans[2]));
//
//        shop.addCustomer(new Customer(humans[3]));
//        shop.addCustomer(new Customer(humans[5]));
//    }

    static ArrayList <Human> humansLine = new ArrayList <>();

    static {
       // humansLine = addObjectToArray(humansLine, humans[1]);
        humansLine.add(humans.get(3));
        humansLine.add(humans.get(0));
        humansLine .add(humans.get(4));
        //humansLine = addObjectToArray(humansLine, humans[2]);
        humansLine.add(humans.get(5));
    }
// static Human[] humansLine = new Human[0];
//
//    static {
//       // humansLine = addObjectToArray(humansLine, humans[1]);
//        humansLine = addObjectToArray(humansLine, humans[3]);
//        humansLine = addObjectToArray(humansLine, humans[0]);
//        humansLine = addObjectToArray(humansLine, humans[4]);
//        //humansLine = addObjectToArray(humansLine, humans[2]);
//        humansLine = addObjectToArray(humansLine, humans[5]);
//    }

}
