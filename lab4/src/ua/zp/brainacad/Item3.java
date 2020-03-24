package ua.zp.brainacad;

/**
 * Написать программу, которая выводит информацию о дне неделе.
 * Например для понедельника – пятницы выводит сообщение “Это рабочий
 * день”, а для субботы и воскресенья выводит “Это выходной!”
 */
public class Item3 {
    public static void main(String[] args) {
        String dayOfWeek = "суббббббота";
        boolean output;                     // Идентификатор дня недели (true - выходной / false - рабочий день)
        switch (dayOfWeek) {
            case "Понедельник":
            case "понедельник":
            case "Вторник":
            case "вторник":
            case "Среда":
            case "среда":
            case "Четверг":
            case "четверг":
            case "Пятница":
            case "пятница":
                output = false;
                break;
            case "Суббота":
            case "суббота":
            case "Воскресенье":
            case "воскресенье":
                output = true;
                break;
            default:
                System.out.println("Нет такого дня недели!!!!");
                return;

        }
        System.out.println(dayOfWeek + " - " + (output ? "Это выходной день!" : "Это рабочий день"));
    }
}
