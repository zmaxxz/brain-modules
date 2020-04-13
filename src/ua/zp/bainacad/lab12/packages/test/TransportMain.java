package ua.zp.bainacad.lab12.packages.test;

import ua.zp.bainacad.lab12.packages.transport.Passport;

public class TransportMain {
    public static void main(String[] args) {
        Passport passTransport = new Passport("BMW", "X5", "Green", "АР3519СК", "Иванов Иван Иванович");
        String newOwnerName = "Петров Петр Петрович";
        passTransport.changeOwner(newOwnerName);
    }
}
