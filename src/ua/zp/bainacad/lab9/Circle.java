package ua.zp.bainacad.lab9;

/**
 * Класс Circle - круг, содержит поля:
 * - radius - радиус
 * - perimeter - периметр
 * - area - площадь
 * - color - цвет, по умолчанию - "Default"
 */
public class Circle {
    private double radius;
    private double perimeter;
    private double area;
    private String color = "Default";

    //конструктор класса Circle создается по умолчанию
    public Circle() {
        this.radius = 1;
        this.perimeter = 2 * Math.PI;
        this.area = Math.PI;
    }

    //конструктор класса Circle создается с параметром radius - радиус
    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = 2 * Math.PI * radius;
        this.area = Math.PI * radius * radius;
    }

    //конструктор класса Circle создается с параметроми radius - радиус, color - цвет
    public Circle(double radius, String color) {
        this.radius = radius;
        this.perimeter = Math.round(2 * Math.PI * radius);
        this.area = Math.PI * radius * radius;
        this.color = color;
    }

    // Метод printCircle() выводит на печать значения полей Circle
    public void printCircle() {
        System.out.println("Круг радиусом - " + radius);
        System.out.println("Периметр круга - " + perimeter);
        System.out.println("Площадь круга - " + area);
        System.out.println("Цвет круга -" + color);
    }

    // Возвращает значение поля radius
    public double getRadius() {
        return radius;
    }
}
