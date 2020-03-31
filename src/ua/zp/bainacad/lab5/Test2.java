package ua.zp.bainacad.lab5;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        PBook firstBook = new PBook();
        firstBook.setBookGenre("фэнтези");
        firstBook.setBookAuthor("Роджер Желязны");
        firstBook.setBookName("Девять принцев Амбера");
        firstBook.setPublishingHouse("Харьков");
        firstBook.setPublishYear(2000);
        firstBook.setPageCount(288);

        System.out.println("Имя класса: " + PBook.getClassName());
        System.out.println("bookGenre = " + firstBook.getBookGenre());
        System.out.println("bookAuthor = " + firstBook.getBookAuthor());
        System.out.println("bookName = " + firstBook.getBookName());
        System.out.println("publishingHouse = " + firstBook.getPublishingHouse());
        System.out.println("publishYear = " + firstBook.getPublishYear());
        System.out.println("pageCount = " + firstBook.getPageCount());


        PPostOffice postOffice = new PPostOffice();
        postOffice.setPostNumber(97);
        postOffice.setPostIndex(69097);
        postOffice.setPostAddress("Энтузиастов, 1");
        postOffice.setPhone("0612771107");

        System.out.println("Имя класса: " + PPostOffice.getClassName());
        System.out.println("postNumber = " + postOffice.getPostNumber());
        System.out.println("postIndex = " + postOffice.getPostIndex());
        System.out.println("postAddress = " + postOffice.getPostAddress());
        System.out.println("phone = " + postOffice.getPhone());


        PShopCustomer shopCustomer=new PShopCustomer();
        shopCustomer.setShopCustomerName("Сергей");
        shopCustomer.setShopCustomerPhone("06712345678");
        shopCustomer.setDiscount(true);
        shopCustomer.setItems(new String[] {"item1", "item2", "item3"});

        System.out.println("Имя класса: " + PShopCustomer.getClassName());
        System.out.println("shopCustomerName = "+shopCustomer.getShopCustomerName());
        System.out.println("shopCustomerPhone = "+shopCustomer.getShopCustomerPhone());
        System.out.println("isDiscount = "+shopCustomer.isDiscount());
        System.out.println("items = "+ Arrays.toString(shopCustomer.getItems()));
    }
}
