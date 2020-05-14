package ua.zp.bainacad.lab17;

/**
 * This enum contains roles of users
 *
 * @author ZMAXXZ
 * @version 1.0 30/04/20
 * @see ua.zp.bainacad.lab17.User
 */
public enum Role {
    /**
     * DIRECTOR can manage staff and prices
     */
    DIRECTOR("Директор магазина, может управлять кадрами, и ценами"),
    /**
     * ADMINISTRATOR can add products and edit their description
     */
    ADMINISTRATOR("Администратор магазина, может добавлять товары и редактировать их описание"),
    /**
     * MANAGER can communicate with customers
     */
    MANAGER("Менеджер магазина, может общаться с клиентами"),
    /**
     * CUSTOMER can buy goods and use a discount
     */
    CUSTOMER("Клиент магазина, может покупать товары и пользоваться дисконтом"),
    /**
     * ANONYMOUS can buy goods and / or log in
     */
    ANONYMOUS("Анонимный пользователь, может покупать товары и или авторизоваться");

    /**
     * Describes rights of role
     */
    private String rights;

    /**
     * Assigns rights to role
     *
     * @param rights rights of role
     */
    Role(String rights) {
        this.rights = rights;
    }

    /**
     * Get rights of role
     *
     * @return {@link #rights}
     */
    public String getRights() {
        return this.rights;
    }
}
