package ua.zp.bainacad.lab17;

/**
 * This class representing some user with parameters
 * <p>
 * like <b>login, password, name, role</b>
 *
 * @author ZMAXXZ
 * @version 1.0 30/04/20
 * @see ua.zp.bainacad.lab17.Role
 */
public class User {
    /**
     * User login
     */
    private String login = "";
    /**
     * User password
     */
    private String password = "";
    /**
     * User name
     */
    private String name = null;
    /**
     * User role, contains some element of <b>enum Role</b>
     * <p>
     * default={@link Role#ANONYMOUS}
     *
     * @see ua.zp.bainacad.lab17.Role
     */
    private Role role = Role.ANONYMOUS;

    /**
     * Construct user with default parameters
     */
    protected User() {
    }

    /**
     * Simple constructor of user
     *
     * @param login    user login
     * @param password user password
     * @param name     user name
     * @param role     user role
     * @see ua.zp.bainacad.lab17.Role
     */
    protected User(String login, String password, String name, Role role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    /**
     * Validate user login
     *
     * @return <b>true</b> after successful verification
     */
    protected boolean isLoginCorrect(String login) {
        return login.equals(this.login);
    }

    /**
     * Validate user password
     *
     * @return <b>true</b> after successful verification
     */
    protected boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }

//    The login can be initialized once and cannot be changed
//    protected void setLogin(String login) {
//        this.login = login;
//    }

    /**
     * Set user password
     *
     * @param password user password
     */
    protected void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get user name
     *
     * @return {@link #name}
     */
    protected String getName() {
        return name;
    }

    /**
     * Set user name
     *
     * @param name user name
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Get user role
     *
     * @return {@link #role}
     */
    protected Role getRole() {
        return role;
    }

    /**
     * Set user role
     *
     * @param role user role
     * @see ua.zp.bainacad.lab17.Role
     */
    protected void setRole(Role role) {
        this.role = role;
    }
}
