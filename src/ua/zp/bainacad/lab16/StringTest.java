package ua.zp.bainacad.lab16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("DIF");
        String str3 = new String("ghi".toCharArray());
        String str4 = new String("JKL".getBytes());
        StringBuilder strBuilder = new StringBuilder("mno");

        String sameString = "Апельсин,Яблоко,Гранат,Груша";
        String[] arrSplitString = sameString.split(",");
        int maxLenght = 0;
        int indexMaxLenght = 0;
        for (int i = 0; i < arrSplitString.length; i++) {
            if (maxLenght < arrSplitString[i].length()) {
                maxLenght = arrSplitString[i].length();
                indexMaxLenght = i;
            }
        }
        System.out.println(arrSplitString[indexMaxLenght].toLowerCase());
        //System.out.println(arrSplitString[Arrays.copyOf(Arrays.spliterator(arrSplitString).,arrSplitString.length)]);

        for (String str : arrSplitString) {
            System.out.println(str.substring(0, 3));
        }

        String iAmNewString = " Я_новая_строка  ";
        iAmNewString = iAmNewString.trim();
        iAmNewString = iAmNewString.replace('_', ' ');
        System.out.println(iAmNewString);


        Scanner in = new Scanner(System.in);
        System.out.print("Вы ввели: ");
        String str = in.nextLine();
        switch (str.toLowerCase()) {
            case "запуск":
                System.out.println("Запускаем процесс");
                break;
            case "завершен":
                System.out.println("Процесс завершен");
                break;
            default:
                System.out.println("Произошла ошибка");
                break;
        }
        String result=stringBuilder(str1,str2,str3,str4,strBuilder.toString(),iAmNewString);
        System.out.println(result);
    }

    public static String stringBuilder(String...str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(str[i]+((i+1)%3==0?"\n":""));
        }
        return stringBuilder.reverse().toString();
    }
}
