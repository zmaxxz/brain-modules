package ua.zp.bainacad.lab12.packages;

import ua.zp.bainacad.lab12.packages.citizen.Passport;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Passport passCitizen = new Passport("СВ123456", "Иван", "Иванов", new Date(2000 - 1900, 10, 12), true);
        ua.zp.bainacad.lab12.packages.technics.Passport passTechnics = new ua.zp.bainacad.lab12.packages.technics.Passport("Samsung", "Smartphone", "SM-A505FM/DS", "R58M4588VVK", new Date(2020 - 1900, 12, 19));
        ua.zp.bainacad.lab12.packages.transport.Passport passTransport = new ua.zp.bainacad.lab12.packages.transport.Passport("BMW", "X5", "Green", "АР3519СК", "Иванов Иван");

    }

}
