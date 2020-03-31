package ua.zp.bainacad.lab5;

/**
 * class PBook
 *
 * поля класса:
 * final className - передает имя класса
 *     bookGenre - жанр книги
 *     bookAuthor - имя автора
 *     bookName - название книги
 *     publishingHouse - издательство
 *     publishYear - год издания
 *     pageCount - количество страниц
 */


public class PBook {
    private static final String className="PBook";
    private String bookGenre;
    private String bookAuthor;
    private String bookName;
    private String publishingHouse;
    private int publishYear;
    private int pageCount;

    public static String getClassName() {
        return className;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
