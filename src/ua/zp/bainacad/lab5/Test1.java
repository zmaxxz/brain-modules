package ua.zp.bainacad.lab5;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.bookGenre = "фэнтези";
        firstBook.bookAuthor = "Роджер Желязны";
        firstBook.bookName = "Девять принцев Амбера";
        firstBook.publishingHouse = "Харьков";
        firstBook.publishYear = 2000;
        firstBook.pageCount = 288;

        System.out.println("Имя класса: " + Book.className);
        System.out.println("bookGenre = " + firstBook.bookGenre);
        System.out.println("bookAuthor = " + firstBook.bookAuthor);
        System.out.println("bookName = " + firstBook.bookName);
        System.out.println("publishingHouse = " + firstBook.publishingHouse);
        System.out.println("publishYear = " + firstBook.publishYear);
        System.out.println("pageCount = " + firstBook.pageCount);


        PostOffice postOffice = new PostOffice();
        postOffice.postNumber = 97;
        postOffice.postIndex = 69097;
        postOffice.postAddress = "Энтузиастов, 1";
        postOffice.phone = "0612771107";

        System.out.println("Имя класса: " + PostOffice.className);
        System.out.println("postNumber = " + postOffice.postNumber);
        System.out.println("postIndex = " + postOffice.postIndex);
        System.out.println("postAddress = " + postOffice.postAddress);
        System.out.println("phone = " + postOffice.phone);


        ShopCustomer shopCustomer=new ShopCustomer();
        shopCustomer.shopCustomerName="Сергей";
        shopCustomer.shopCustomerPhone="06712345678";
        shopCustomer.isDiscount=true;
        shopCustomer.items = new String[] {"item1", "item2", "item3"};

        System.out.println("Имя класса: " + ShopCustomer.className);
        System.out.println("shopCustomerName = "+shopCustomer.shopCustomerName);
        System.out.println("shopCustomerPhone = "+shopCustomer.shopCustomerPhone);
        System.out.println("isDiscount = "+shopCustomer.isDiscount);
        System.out.println("items = "+ Arrays.toString(shopCustomer.items));
    }
}
