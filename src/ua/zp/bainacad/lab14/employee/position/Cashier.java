package ua.zp.bainacad.lab14.employee.position;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.human.Human;

import java.util.Date;

public class Cashier extends Employee {
    private int cashboxNumber;

    public Cashier(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public Cashier(Human human) {
        super(human.getFullName(),human.getPhoneNumber());
    }

    public void countMoney() {
        System.out.println("\t\t\t\tсчитает деньги");
    }

    @Override
    public void doWork(String str) {
        if (str=="покупает товар"){
            System.out.println("\t\t\tКассир "+this.getFullName()+" делает работу");
            countMoney();
            System.out.println();
        }
    }

    public Integer getCashboxNumber() {
        return cashboxNumber;
    }

    public void setCashboxNumber(int cashboxNumber) {
        this.cashboxNumber = cashboxNumber;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                super.toString() + ", " +
                "cashboxNumber=" + cashboxNumber +
                "} ";
    }
}
