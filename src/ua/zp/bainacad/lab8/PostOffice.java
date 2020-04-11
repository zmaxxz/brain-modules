package ua.zp.bainacad.lab8;

/**
 * class PPostOffice - описание почтового отделения
 *
 * поля класса:
 * final className - передает имя класса
 *     postNumber - номер почтового отделения
 *     postIndex - почтовый индекс
 *     postAddress - адресс расположения
 *     phone - контактный номер
 *     listOfPackages - список посылок
 *     isListOfPackages - получен ли список посылок
 *     isPackagesPacked - упакован ли список посылок
 *     isPackagesSent - отправлен ли список посылок
 */

public class PostOffice {
    public static final String CLASS_NAME = "PostOffice";
    private int postNumber;
    private int postIndex;
    private String postAddress;
    private String phone;
    private String listOfPackages;
    private boolean isListOfPackages;
    private boolean isPackagesPacked;
    private boolean isPackagesSent;

    // Статический метод который поределяет объемный вес посылки
    public static double volume (double length, double width, double height){
        return length*width*height;
    }

    // Метод проверяющий наличие списка посылок для приема
    public boolean tekeListOfPackages(String list){
        if (list==null){
            System.out.println("Список посылок пуст");
            return isListOfPackages = false;
        }
        System.out.println("Приняли список посылок");
        listOfPackages=list;
        System.out.println(listOfPackages);
        return isListOfPackages = true;
    }

    //Метод проверяющий возможность упаковки по принятому списку
    public boolean packingPackages(){
        if (!isListOfPackages){
            System.out.println("Нечего паковать. Отсутствует список посылок");
            return isPackagesPacked = false;
        }
        System.out.println("Упаковали посылки по спику");
        System.out.println(listOfPackages);
        return isPackagesPacked = true;
    }

    // Метод проверяющий возможность отправки упакованных по списку посылок
    public boolean sendingPackages(){
        if (!isPackagesPacked){
            System.out.println("Нечего отправлять. Отсутствуют упакованные посылки");
            return isPackagesSent = false;
        }
        System.out.println("Отправляем упакованные посылки по спику");
        System.out.println(listOfPackages);
        return isPackagesSent = true;
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

