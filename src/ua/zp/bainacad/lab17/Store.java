package ua.zp.bainacad.lab17;

import java.util.ArrayList;

/**
 * This class representing <b>Store</b>. It's name, URL, array of users and authorized user
 *
 * @author ZMAXXZ
 * @version 1.0 13/05/20
 * @see ua.zp.bainacad.lab17.User
 */
public class Store {
    /**
     * Store name
     */
    private String name;
    /**
     * Store URL
     */
    private String url;
    /**
     * Store users array
     *
     * @see ua.zp.bainacad.lab17.User
     */
    private ArrayList<User> userList;
    /**
     * Store authorized user
     *
     * @see ua.zp.bainacad.lab17.User
     */
    private User authorizedUser;

    /**
     * Simple constructor of <b>Store</b>
     *
     * @param name     Store name
     * @param url      Store URL
     * @param userList Store users array
     * @see ua.zp.bainacad.lab17.User
     */
    public Store(String name, String url, ArrayList<User> userList) {
        this.name = name;
        this.url = url;
        this.userList = userList;
    }

    /**
     * Try to login with parameters of <b>User</b>. If matches found then User authorised.
     *
     * @param login    verifiable <b>User</b> login
     * @param password verifiable <b>User</b> password
     * @return true if login & password are correct
     * @see ua.zp.bainacad.lab17.User
     */
    public boolean login(String login, String password) {
        for (User user : userList) {
            if (user.isLoginCorrect(login)) {
                if (user.isPasswordCorrect(password)) {
                    authorizedUser = user;
                    System.out.println("Авторизация прошла успешно");
                    return true;
                } else {
                    break;  // since the login is unique and the password does not match, we interrupt the cycle
                }
            }
        }
        System.out.println("Неверный логин и\\или пароль");
        return false;

    }

    /**
     * Get rights of User
     *
     * @see ua.zp.bainacad.lab17.User
     * @see ua.zp.bainacad.lab17.Role
     */
    public void getCurrentUserRights() {
        System.out.println(authorizedUser.getRole().getRights());
    }

    /**
     * Authorised user logout
     */
    public void logout() {
        authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }
}
