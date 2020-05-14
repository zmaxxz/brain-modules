package ua.zp.bainacad.lab18.task2;

import static ua.zp.bainacad.lab18.task2.MoneyTransactionUtil.sendTo;

public class UserBank {
    public static void main(String[] args) {
        try {
            sendTo(12345, 67890, 25_000);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }

        try {
            sendTo(12345, 12345, 25_000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            sendTo(12345, 67890, 125_000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            sendTo(12345, 67890, -0.25);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }
    }
}
