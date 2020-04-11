package ua.zp.bainacad.lab8;

public class TestPostOffice {
    public static void main(String[] args) {

        //Инициализируем почтовое отделение
        PostOffice postOffice = new PostOffice();
        postOffice.setPostNumber(97);
        postOffice.setPostIndex(69097);
        postOffice.setPostAddress("Энтузиастов, 1");
        postOffice.setPhone("0612771107");

        //Выводим информацию о почтовом отделении
        System.out.println("Имя класса: " + PostOffice.CLASS_NAME);
        System.out.println("postNumber = " + postOffice.getPostNumber());
        System.out.println("postIndex = " + postOffice.getPostIndex());
        System.out.println("postAddress = " + postOffice.getPostAddress());
        System.out.println("phone = " + postOffice.getPhone());

        //Передаем список посылок
        postOffice.tekeListOfPackages("package 1, package 2, package 3");

        //пробуем отправить неупакованные посылки
        postOffice.sendingPackages();

        //упаковываем посылки
        postOffice.packingPackages();

        //отправляем посылки
        postOffice.sendingPackages();

        double length = 10.0;
        double width = 7.5;
        double height = 3.2;

        //проверяем работу статического метода определения объема посылки
        System.out.println("Определяем обем посылки: длина = " + length + ", ширина = " + width + ", высота = " + height);
        System.out.println("Объем = " + PostOffice.volume(length, width, height));

    }
}
