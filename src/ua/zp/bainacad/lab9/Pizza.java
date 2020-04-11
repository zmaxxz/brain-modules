package ua.zp.bainacad.lab9;

/**
 * Класс Pizza - пицца, содержит поля:
 * - basis - основа, тип класса Circle
 * - composition - состав
 * - name - название
 * - coast - стоимость
 */
public class Pizza {

    private Circle basis;
    private String composition;
    private String name;
    private double coast;

    //конструктор класса Pizza создается по умолчанию
    public Pizza() {
        this.basis = new Circle(50 / 2, "Цветов Итальянского флага");
        this.composition = "Морепродукты, перец болгарский, маслины, сыр, специи, оливковое масло";
        this.name = "Итальянская";
        this.coast = 85;
    }

    //конструктор класса Pizza создается с параметроми name, composition, coast, diameter
    public Pizza(String name, String composition, double coast, double diameter) {
        this.basis = new Circle(diameter / 2);
        this.composition = composition;
        this.name = name;
        this.coast = coast;
    }

    //возвращает поле basis, класса Circle
    public Circle getBasis() {
        return basis;
    }

    //выводит на печать поля класса Pizza
    public void printPizza() {
        System.out.println("Название: " + this.name);
        System.out.println("Состав: " + this.composition);
        System.out.println("Стоимость: " + coast + " грн.");
    }
}
