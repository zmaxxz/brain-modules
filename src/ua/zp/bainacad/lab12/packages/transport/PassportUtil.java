package ua.zp.bainacad.lab12.packages.transport;

public class PassportUtil {
    private PassportUtil() {
        //«закрытый конструктор»
    }

    static Passport changeOwner(Passport ownerPassport, String newOwner) {
        Passport newOwnerPassport = new Passport(ownerPassport.getCarManufacturer(), ownerPassport.getCarModel(), ownerPassport.getColor(), ownerPassport.getRegistrationNumber(), newOwner);
        return newOwnerPassport;
    }
}
