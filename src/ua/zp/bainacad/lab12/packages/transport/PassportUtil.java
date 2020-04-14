package ua.zp.bainacad.lab12.packages.transport;

import org.jetbrains.annotations.NotNull;

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
     * Статический метод <b>changeOwner</b> - переоформление автомобиля.
     * Метод имеет модификатор доступа <b>package-private (default)</b>, поэтому доступ можно получить только
     * в этом пакете и его наследниках.
     *
     * @param ownerPassport {@link Passport} - паспортные данные автомобиля
     * @param newOwner      новый владелец
     * @return {@link Passport} - паспортные данные автомобиля
     */
    static Passport changeOwner(@NotNull Passport ownerPassport, @NotNull String newOwner) {
        Passport newOwnerPassport = new Passport(ownerPassport.getCarManufacturer(), ownerPassport.getCarModel(), ownerPassport.getColor(), ownerPassport.getRegistrationNumber(), newOwner);
        return newOwnerPassport;
    }
}
