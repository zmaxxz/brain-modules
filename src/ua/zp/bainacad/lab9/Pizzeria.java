package ua.zp.bainacad.lab9;

/**
 * Класс Pizzeria - пицерия, содержит два static поля:
 * - массив pizzas класса Pizza
 * - final count=3 - количество элементов массива pizzas
 */

public class Pizzeria {

    private static Pizza[] pizzas;
    private static final int count = 3;

    // принудительная инициализация метода main()
    static {
        main();
    }

    //заполнение массива pizzas типом данных типа Pizza
    public static void main() {
        pizzas = new Pizza[count];
        pizzas[0] = new Pizza();
        pizzas[1] = new Pizza("Барбекю", "Курица, грибы, сыр, лук маренованный, соус барбекю", 68.5, 75);
        pizzas[2] = new Pizza("Пицца 3", "Ингридиенты закончились, накидали что было", 125.75, 12.5);
    }

    //Выводит на печать Pizza по идентификатору (id) массива pizzas
    public static void printPizzas() {
        for (int id = 0; id < count; id++) {
            System.out.println("Пицца " + (id + 1));
            System.out.println("Диамеьр: " + pizzas[id].getBasis().getRadius() * 2);
            pizzas[id].printPizza();
        }
    }
}
