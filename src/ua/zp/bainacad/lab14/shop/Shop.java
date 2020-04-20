package ua.zp.bainacad.lab14.shop;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.human.Human;

import java.util.ArrayList;


import static ua.zp.bainacad.MyUtil.*;

public class Shop {
    private String shopName;
    private String address;
    private ArrayList <Employee> employees=new ArrayList<Employee>();
    private ArrayList<Customer> customers=new ArrayList<Customer>();


    public Shop(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }

    public void toOpen(Human[] humansLine) {

//        if (!employees[2].getPresent()) {
//                System.out.println("Первым всегда заходит в магазин охранник");
//
//                employees[2].comeToWork(humansLine);
//                if (!employees[2].getPresent()) {
//                    System.out.println("Магазин не откроется, ключи у охранника, он не пришел.\n");
//                    return;
//                }
//            }
//            employees[0].comeToWork(humansLine);
//            employees[1].comeToWork(humansLine);
//
//            if (!employees[0].getPresent()||!employees[1].getPresent()){
//                System.out.println("Магазин не откроется, не все работники пришли на работу.\n");
//                return;
//        }
        
//        System.out.println("Магазин " + shopName + " открывается");
//        sellGoods(humansLine);
    }

    public void goForLunch() {
        System.out.println("Магазин " + shopName + " закрывается на обед");
    }

    public void sellGoods(Human[] humansLine) {

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
}
