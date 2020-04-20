package ua.zp.bainacad.lab14.employee.position;

import ua.zp.bainacad.lab14.employee.Employee;
import ua.zp.bainacad.lab14.human.Human;

import java.util.Date;

public class Guard extends Employee {

    public Guard(String fullName, String phoneNumber) {
        super(fullName, phoneNumber);
    }

    public Guard(Human human) {
        super(human.getFullName(),human.getPhoneNumber());
    }

    public void speakToRadioSet() {
        System.out.println("охранник говорит по рации");
    }

    @Override
    public void doWork() {

        System.out.println(" охранник делает работу ");
        speakToRadioSet();
    }

    @Override
    public String toString() {
        return "Guard{"+super.toString()+"} ";
    }
}
