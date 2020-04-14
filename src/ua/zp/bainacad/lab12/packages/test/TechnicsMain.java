package ua.zp.bainacad.lab12.packages.test;

import ua.zp.bainacad.lab12.packages.technics.Passport;
import ua.zp.bainacad.lab12.packages.technics.PassportUtil;

import java.util.Date;

public class TechnicsMain {
    public static void main(String[] args) {
        // Инициализируем объект типа Passport - паспортные данные бытовой техники
        Passport passTechnics = new Passport("Samsung", "Smartphone", "SM-A505FM/DS", "R58M4588VVK", new Date(2019 - 1900, 12 - 1, 19));
        // Производим замену по гарантии,с переинициализацией даты Passport.warrantyStartDate новым значением
        PassportUtil.warrantyReplace(passTechnics, new Date(2020 - 1900, 2 - 1, 12));
    }
}
