package ua.zp.bainacad.lab18.task2;

public class MoneyTransactionUtil {

    public static void sendTo(int cardMoneyOut, int cardMoneyIn, double amountOfMoney) throws RuntimeException {
        if (cardMoneyOut == cardMoneyIn) {
            throw new RuntimeException("Номера карт совпадают");
        }
        if (100_000 < amountOfMoney || amountOfMoney <= 0) {
            throw new RuntimeException("Сумма должна быть больше 0 и менше 100_000");
        }
        System.out.printf("Сумма %.2f, со счета %d успешно переведена на счет %d\n", amountOfMoney, cardMoneyOut, cardMoneyIn);
    }

    private MoneyTransactionUtil() {
    }

}
