package ua.zp.bainacad.lab14.employee;

import ua.zp.bainacad.lab14.human.Human;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import static ua.zp.bainacad.MyUtil.getIdFromArrayListObjectByObject;

public class Employee extends Human {
    private Date employmentDate;
    private double salary;
    private boolean isPresent;

    public Employee(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public <T> void comeToWork(ArrayList<T> humansLine) {
        int employeeIdInHumansLine = getIdFromArrayListObjectByObject(humansLine, super.hashCode());
        if (employeeIdInHumansLine < 0) {
            return;
        }
        humansLine.remove(employeeIdInHumansLine);
        isPresent = true;
        System.out.println("\t"+getFullName() + " пришел на работу");
        System.out.println("\tЯ " + this.getClass().getSimpleName());
        sayHello();
    }

    public void goForLunch() {
        System.out.println("\t"+getFullName() +"пошел на обед");
        sayGoodbye();
        isPresent = false;
    }

    public void doWork(String str) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                isPresent == employee.isPresent &&
                Objects.equals(employmentDate, employee.employmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employmentDate, salary, isPresent);
    }
}
