package ua.zp.bainacad.lab12.packages.test;

import ua.zp.bainacad.lab12.packages.citizen.Passport;

// Статический импорт статического метода marriageRegistrate
import static ua.zp.bainacad.lab12.packages.citizen.PassportUtil.marriageRegistrate;

import java.util.Date;

public class CitizenMain {
    public static void main(String[] args) {
        Passport passCitizen1 = new Passport("СВ123456", "Иван", "Иванов", new Date(2000 - 1900, 10, 12), true);
        Passport passCitizen2 = new Passport("СВ654321", "Татьяна", "Петрова", new Date(1990 - 1900, 1, 1), false);
        marriageRegistrate(passCitizen1, passCitizen2);
    }

}
