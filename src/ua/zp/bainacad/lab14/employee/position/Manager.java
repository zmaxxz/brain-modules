package ua.zp.bainacad.lab14.employee.position;

import ua.zp.bainacad.lab14.customer.Customer;
import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.human.Human;

import java.util.Date;

public class Manager extends Employee {
    private String branch;

    public Manager(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public Manager(Human human) {
        super(human.getFullName(),human.getPhoneNumber());
    }

    public void consult() {
        System.out.println("менеджер консультирует клиента");
    }

    public void tallAboutDiscounts() {
        System.out.println("менеджер рассказывает клиенту про скидки");
    }

    public void giveAdvice() {
        System.out.println("менеджер советует клиенту");
    }

    @Override
    public void doWork() {
        super.doWork();
        System.out.println(" менеджер делает работу ");
        consult();
        tallAboutDiscounts();
        giveAdvice();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() + ", " +
                "branch='" + branch + '\'' +
                '}';
    }
}
