package ua.zp.bainacad.lab5;

/**
 * class PPostOffice - описание почтового отделения
 *
 * поля класса:
 * final className - передает имя класса
 *     postNumber - номер почтового отделения
 *     postIndex - почтовый индекс
 *     postAddress - адресс расположения
 *     phone - контактный номер
 */

public class PPostOffice {
    private static final String className = "PPostOffice";
    private int postNumber;
    private int postIndex;
    private String postAddress;
    private String phone;

    public static String getClassName() {
        return className;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
