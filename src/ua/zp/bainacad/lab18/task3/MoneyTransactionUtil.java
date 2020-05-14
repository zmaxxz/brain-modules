package ua.zp.bainacad.lab18.task3;

public class MoneyTransactionUtil {

    public static void sendTo(int cardMoneyOut, int cardMoneyIn, double amountOfMoney) throws AccountException,MoneyValueException  {
        if (cardMoneyOut == cardMoneyIn) {
            throw new AccountException("Номера карт совпадают");
        }
        if (100_000 < amountOfMoney || amountOfMoney <= 0) {
            throw new  MoneyValueException("Сумма должна быть больше 0 и менше 100_000");
        }
        System.out.printf("Сумма %.2f, со счета %d успешно переведена на счет %d\n", amountOfMoney, cardMoneyOut, cardMoneyIn);
    }

    private MoneyTransactionUtil() {
    }

}
