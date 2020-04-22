package ua.zp.bainacad.lab14.employee.position;

import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.human.Human;

public class Manager extends Employee {
    private String branch;

    public Manager(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public Manager(Human human) {
        this(human.getFullName(), human.getPhoneNumber());
    }

    public void consult() {
        System.out.println("\t\t\t\tконсультирует клиента");
    }

    public void tallAboutDiscounts() {
        System.out.println("\t\t\t\tрассказывает клиенту про скидки");
    }

    public void giveAdvice() {
        System.out.println("\t\t\t\tсоветует клиенту");
    }

    @Override
    public void doWork(String str) {
        if (str == "узнает про товары") {
            System.out.println("\t\t\tМенеджер " + getFullName() + " делает работу");
            consult();
            tallAboutDiscounts();
            giveAdvice();
            System.out.println();
        }
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
