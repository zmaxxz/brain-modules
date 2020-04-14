package ua.zp.bainacad.lab12.packages.test;

import ua.zp.bainacad.lab12.packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        // Инициализируем объект типа Passport - паспортные данные на автомобиль
        Passport passTransport = new Passport("BMW", "X5", "Green", "АР3519СК", "Иванов Иван Иванович");
        // Меняем владельца автомобиля
        String newOwnerName = "Петров Петр Петрович";
        passTransport.changeOwner(newOwnerName);
    }
}
