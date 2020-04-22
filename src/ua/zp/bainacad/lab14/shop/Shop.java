package ua.zp.bainacad.lab14.shop;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.employee.position.Cashier;
import ua.zp.bainacad.lab14.employee.position.Guard;
import ua.zp.bainacad.lab14.employee.position.Manager;
import ua.zp.bainacad.lab14.human.Human;

import java.util.ArrayList;


import static ua.zp.bainacad.MyUtil.*;

public class Shop {
    private String shopName;
    private String address;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private Customer guest;

    public Shop(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public void toOpen(ArrayList<Human> humansLine) {
        if (!employees.get(getIdByClass(Guard.class)).getPresent()) {
            System.out.println("Первым всегда заходит в магазин охранник");

            employees.get(getIdByClass(Guard.class)).comeToWork(humansLine);
            if (!employees.get(getIdByClass(Guard.class)).getPresent()) {
                System.out.println("Магазин не откроется, ключи у охранника, он не пришел.\n");
                return;
            }
        }
        employees.get(getIdByClass(Manager.class)).comeToWork(humansLine);
        employees.get(getIdByClass(Cashier.class)).comeToWork(humansLine);
        if (!employees.get(getIdByClass(Manager.class)).getPresent() || !employees.get(getIdByClass(Cashier.class)).getPresent()) {
            System.out.println("Магазин не откроется, не все работники пришли на работу.\n");
            return;
        }
        System.out.println("Магазин " + shopName + " открывается.\nЖдем покупателей.\n");
        sellGoods(humansLine);
    }

    private <T> int getIdByClass(Class<T> byClass) {
        return getIdFromArrayListObjectByClass(employees, byClass);
    }

    public void goForLunch() {
        System.out.println("Магазин " + shopName + " закрывается на обед.\n");
        for (Employee emp : employees) {
            if (emp.getClass()!=Guard.class) {
                emp.goForLunch();
            }
        }
        System.out.println("Последним всегда уходит и закрывает магазин охранник.");
        employees.get(getIdByClass(Guard.class)).goForLunch();
    }

    public void sellGoods(ArrayList<Human> humansLine) {
        System.out.println("Магазин " + shopName + " начинает продавать товары.\n");
        long time = System.currentTimeMillis();
        while (time + 10L > System.currentTimeMillis()) {
            if (isGuestIn(humansLine)) {
                doWork(guest.knowAboutGoods());
                doWork(guest.buyGoods());
                doWork("охранник сделай что нибудь");
                guestOut();
            }
        }
        System.out.println("Пришло время обеда.\n");
        goForLunch();
    }

    public void doWork(String str) {
        for (Employee emp : employees) {
            emp.doWork(str);
        }
    }

    public boolean isGuestIn(ArrayList<Human> humansLine) {
        if (humansLine.size() > 0) {
            this.guest = new Customer(humansLine.get(0));
            humansLine.remove(0);
            System.out.println("Покупатель " + this.guest.getFullName() + " зашел в магазин");
            this.guest.sayHello();
            return true;
        }
        return false;
    }

    public void guestOut() {
        this.guest.sayGoodbye();
        System.out.println("Покупатель " + this.guest.getFullName() + " покидает магазин\n");
        guest = null;
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Human getGuest() {
        return guest;
    }

}
