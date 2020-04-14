package ua.zp.bainacad.lab12.packages.citizen;

/**
 * Класс утилита <b>PassportUtil</b>
 *
 * @author Максим Деенков
 * @version 1.0
 */
public class PassportUtil {
    private PassportUtil() {
        //«закрытый конструктор»
    }

    /**
     * Статический метод <b>marriageRegistrate</b> инициализирует поля {@link Passport#spouseId} супругов, передавая номера паспортов друг-друга {@link Passport#id}
     *
     * @param passport1 {@link Passport} первого, из супругов
     * @param passport2 {@link Passport} второго, из супругов
     */
    public static void marriageRegistrate(Passport passport1, Passport passport2) {
        passport1.setSpouseId(passport2.getId());
        passport2.setSpouseId(passport1.getId());
    }
}
