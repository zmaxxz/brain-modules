package ua.zp.bainacad.lab14.human;

import java.util.Date;
import java.util.Objects;

public class Human {

    private String fullName;
    private Date birthday;
    private String phoneNumber;


    public Human(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public void sayHello() {
        System.out.println("\t"+fullName+" говорит ПРИВЕТ!\n");
    }

    public void sayGoodbye() {
        System.out.println("\t"+fullName+" говорит ДО СВИДАНИЯ!\n");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return fullName.equals(human.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
