package ua.zp.brainacad;

/**
 * Написать программу, которая выводит на экран каждое 3-е i-ое значение цикла.
 * (выводит каждое третье число факториала)
 *
 * 	1
 * 	2
 * 6    -> 3-e
 * 	24
 * 	120
 * 720  -> 3-e
 * 	5040
 */
public class Item5 {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 0;
        while ((factorial *= ++i) < 10000) {

            if (i % 3 != 0) {
                continue;
            }
            System.out.println(factorial);
        }

        factorial = 1;
        i = 0;
        while ((factorial *= ++i) < 10000) {

            if (i % 3 != 0) {
                System.out.println("\t" + factorial);
            } else {
                System.out.println(factorial);
            }
        }
    }
}
