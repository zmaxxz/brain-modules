package ua.zp.bainacad.lab14.employee;

import ua.zp.bainacad.lab14.employee.position.Guard;
import ua.zp.bainacad.lab14.human.Human;

import java.util.Date;

import static ua.zp.bainacad.MyUtil.getIdFromArrayObjectByObject;

public class Employee extends Human {
    private Date employmentDate;
    private double salary;
    private boolean isPresent;

    public Employee(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public void comeToWork(Human[] humansLine) {
        int employeeIdInHumansLine=getIdFromArrayObjectByObject(humansLine, this);
        if (employeeIdInHumansLine<0){
            return;
        }
        humansLine[employeeIdInHumansLine]=null;
        isPresent = true;
        System.out.println(getFullName() + " пришел на работу");
        sayHello();
        System.out.println("Я "+this.getClass().getSimpleName()+'\n');


    }

    public void goForLunch() {
        System.out.println("пошел на обед");
        isPresent = false;
    }

    public void doWork() {

    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() + ", " +
                "employmentDate=" + employmentDate +
                ", salary=" + salary +
                ", isPresent=" + isPresent +
                '}';
    }
}
