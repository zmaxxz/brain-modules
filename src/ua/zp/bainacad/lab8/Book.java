package ua.zp.bainacad.lab8;

import java.util.Arrays;

/**
 * class PBook
 * <p>
 * поля класса:
 * final className - передает имя класса
 * bookGenre - жанр книги
 * bookAuthor - имя автора
 * bookName - название книги
 * publishingHouse - издательство
 * publishYear - год издания
 * pageCount - количество страниц
 * chapterCount - количество глав
 * [] chapterName - массив содержащий названия глав
 * [] chapterPage - массив содержащий указание страниц на главы
 */


public class Book {
    public static final String CLASS_NAME = "Book";

    private String bookGenre;
    private String bookAuthor;
    private String bookName;
    private String publishingHouse;
    private int publishYear;
    private int pageCount;
    private int chapterCount;
    private String[] chapterName;
    private int[] chapterPage;

    // Метод который листает книгу на заданную страницу
    public boolean goToPage(int page) {
        if (this.pageCount >= page && page > 0) {
            System.out.println("Листаем на страницу " + page);
            return true;
        } else {
            System.out.println("Указана неверная страница. В книге всего " + this.pageCount + " странц");
            return false;
        }
    }

    // Перегруженный метод который листает книгу на начало определенной главы
    public boolean goToPage(String chapter) {
        int i = 0;
        for (String value : chapterName) {
            if (value.equals(chapter)) {
                System.out.println("Листаем на страницу " + this.chapterPage[i] + ", главы - " + chapter);
                return true;
            }
            i++;
        }
        System.out.println("Нет такой главы в этой книге");
        return false;
    }


    // Метод вывода на печать списка глав
    public void printCapters() {
        System.out.println(this.bookName + "\nСписок глав");
        for (String value : this.chapterName) {
            System.out.println(value);
        }
    }

    // Метод определяющий главу книги по заданной странице
    public boolean getChapterByPage(int page) {
        if (goToPage(page)) {
            int index = 0;
            for (int i = 0; i < this.chapterCount - 1; i++) {
                if (this.chapterPage[i] <= page && page < this.chapterPage[i + 1]) {
                    System.out.println("Данная страница принадлежит главе - " + this.chapterName[i]);
                }
            }
            return true;
        }
        return false;
    }

    // Метод присваивающий начальную страницу главе книги
    public void setChapterNamePage(String name, int page, int index) {
        this.chapterName[index] = name;
        this.chapterPage[index] = page;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public String[] getChapterName() {
        return chapterName;
    }

    public void setChapterName(String[] chapterName) {
        this.chapterName = chapterName;
    }

    public int[] getChapterPage() {
        return chapterPage;
    }

    public void setChapterPage(int[] chapterPage) {
        this.chapterPage = chapterPage;
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
