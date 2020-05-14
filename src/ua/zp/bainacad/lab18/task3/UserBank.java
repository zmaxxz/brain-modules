package ua.zp.bainacad.lab18.task3;

import static ua.zp.bainacad.lab18.task3.MoneyTransactionUtil.sendTo;

public class UserBank {
    public static void main(String[] args) {
        try {
            sendTo(12345, 67890, 25_000);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }

        try {
            sendTo(12345, 12345, 25_000);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        } catch (MoneyValueException e) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100_000");
        }

        try {
            sendTo(12345, 67890, 125_000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            sendTo(12345, 67890, -0.25);
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают.");
        } catch (MoneyValueException e) {
            System.out.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100_000");
        }
    }
}
