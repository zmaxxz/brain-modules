package ua.zp.bainacad.lab14.customer;

import ua.zp.bainacad.lab14.human.Human;
import ua.zp.bainacad.lab14.shop.Shop;

import java.util.Date;
import java.util.Objects;

/**
 * Класс
 */
public class Customer extends Human {
    private static int cardCount = 0;
    private int cardDiscount;
    private double moneyCount;
    private boolean isIn;

    public Customer(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
        cardCount++;
        this.cardDiscount = cardCount;
    }


    public Customer(Human human) {
        this(human.getFullName(), human.getPhoneNumber());
    }

    public String knowAboutGoods() {
        String str="узнает про товары";
        System.out.println("\t\t"+this.getFullName()+" "+str);
        return str;
    }

    public String buyGoods() {
        String str="покупает товар";
        System.out.println("\t\t"+this.getFullName()+" "+str);
        return str;
    }

    public int getCardDiscount() {
        return cardDiscount;
    }

    public double getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(double moneyCount) {
        this.moneyCount = moneyCount;
    }

    public boolean isIn() {
        return isIn;
    }

    public void setIn(boolean in) {
        isIn = in;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+ ", "+
                "cardDiscount=" + cardDiscount +
                ", moneyCount=" + moneyCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return cardDiscount == customer.cardDiscount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardDiscount);
    }
}
