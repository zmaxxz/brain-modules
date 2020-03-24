package ua.zp.brainacad;

/**
 * Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
 * и возле каждого пишет четное это число или нечетное.
 * Пример
 * 1 -> нечетное
 * 2 -> четное
 * и т д.
 */
public class Item2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + (i % 2 == 0 ? "четное" : "нечетное"));
        }

    }
}
