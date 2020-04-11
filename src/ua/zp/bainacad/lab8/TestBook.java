package ua.zp.bainacad.lab8;

/**
 * В данном практическом задании я немного разогнался и добавил логики
 */
public class TestBook {
    public static void main(String[] args) {

        // Инциализируем новую книгу
        Book firstBook = new Book();
        firstBook.setBookGenre("фэнтези");
        firstBook.setBookAuthor("Роджер Желязны");
        firstBook.setBookName("Девять принцев Амбера");
        firstBook.setPublishingHouse("Харьков");
        firstBook.setPublishYear(2000);
        firstBook.setPageCount(288);
        firstBook.setChapterCount(10);
        firstBook.setChapterName(new String[10]);
        firstBook.setChapterPage(new int[10]);

        // Заполняем названия глав и проставляем им соответтвующие начальные страницы
        for (int i = 0; i < firstBook.getChapterCount(); i++) {
            firstBook.setChapterNamePage(("Глава " + (i + 1)), (int) Math.round(firstBook.getPageCount() / firstBook.getChapterCount() * i + 1), i);
        }

        // Выводим на печать получившуюся книгу
        System.out.println("Имя класса: " + Book.CLASS_NAME);
        System.out.println("bookGenre = " + firstBook.getBookGenre());
        System.out.println("bookAuthor = " + firstBook.getBookAuthor());
        System.out.println("bookName = " + firstBook.getBookName());
        System.out.println("publishingHouse = " + firstBook.getPublishingHouse());
        System.out.println("publishYear = " + firstBook.getPublishYear());
        System.out.println("pageCount = " + firstBook.getPageCount());

        // Вызываем метод goToPage(номер страницы) с разными значениями, для проверки работы метода
        firstBook.goToPage(-1);
        firstBook.goToPage(250);
        firstBook.goToPage(350);

        // Вызываем метод выводящий на печать список глав
        firstBook.printCapters();

        // Вызываем метод указывающий принадлежность страницы к определенной главе
        firstBook.getChapterByPage(59);
        firstBook.getChapterByPage(299);

        // вызываем метод листающий книгу на начало заданной главы
        firstBook.goToPage("Глава 4");
        firstBook.goToPage("глава 4");

    }
}
