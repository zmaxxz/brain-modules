package ua.zp.bainacad.lab9;

/**
 * Создаем три екземпляра класса Circle, обращаясь к разным конструкторам
 * Выводим на печать содержание екземпляров класса Circle, методом printCircle()
 * <p>
 * Выводим на печать static методом printPizzas(), проинициализированное содержимое класса Pizzeria
 */

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10, "Red");

        circle1.printCircle();
        circle2.printCircle();
        circle3.printCircle();

        //Pizzeria.main(); - метод не задействован, вызываается статически

        Pizzeria.printPizzas();

    }
}
