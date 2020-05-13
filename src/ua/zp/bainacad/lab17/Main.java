package ua.zp.bainacad.lab17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is main class
 *
 * @author ZMAXXZ
 * @version 1.0 13/05/20
 * @see ua.zp.bainacad.lab17.User
 * @see ua.zp.bainacad.lab17.Store
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User("director", "qwerty", "Василий Иванович", Role.DIRECTOR);
        User user2 = new User("admin", "qwe123", "Николай Петрович", Role.ADMINISTRATOR);
        User user3 = new User("menager", "rty123", "Василий Анатольевич", Role.MANAGER);
        User user4 = new User("customer", "qwerty123456", "Димон", Role.CUSTOMER);
        User user5 = new User();

        Store newStore = new Store("STORE", "bainacad.zp.ua", addUsers(user1, user2, user3, user4, user5));

        while (true) {
            tryLogin(newStore);
        }
    }

    /**
     * Try login to <b>Store</b>
     *
     * @param store <b>Store</b>
     * @see ua.zp.bainacad.lab17.Store
     */
    public static void tryLogin(Store store) {
        Scanner inputLogin = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = inputLogin.nextLine();
        System.out.print("Введите пароль: ");
        String password = inputPassword.nextLine();
        if (store.login(login, password)) {
            store.getCurrentUserRights();
            store.logout();
        }
    }

    /**
     * Forms array of <b>User</b>
     *
     * @param users varargs of <b>User</b>
     * @return array of <b>User</b>
     * @see ua.zp.bainacad.lab17.User
     */
    public static ArrayList<User> addUsers(User... users) {
        ArrayList<User> newUsers = new ArrayList<User>();
        for (User user : users) {
            newUsers.add(user);
        }
        return newUsers;
    }
}
