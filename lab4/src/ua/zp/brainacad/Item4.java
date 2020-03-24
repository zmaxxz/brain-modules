package ua.zp.brainacad;

/**
 * Написать программу, которая считает факториал числа и выводит
 * промежуточные значения на экран.
 * Условие: если промежуточное значение >1000, завершить цикл предварительно
 * написав в консоли “Достигнут максимально возможный результат”.
 */
public class Item4 {
    public static void main(String[] args) {
        int factorial = 1;
        int i=1;
        while(factorial<=1000){
            factorial*=i++;
            System.out.println(factorial);
        }
    }
}
