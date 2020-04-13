package ua.zp.bainacad.lab12.packages.technics;

import java.util.Date;

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
     * Статический метод <b>marriageRegistrate</b> - замена по гарантии.
     * <p>Позволяет переинициализировать дату {@link Passport#warrantyStartDate} новым значением <b>dateReplace</b>
     *
     * @param passport    паспорт бытовой техники типа {@link Passport}
     * @param dateReplace дата замены по гарантии типа {@link java.util.Date}
     */
    public static void warrantyReplace(Passport passport, Date dateReplace) {
        passport.setWarrantyStartDate(dateReplace);
    }
}
