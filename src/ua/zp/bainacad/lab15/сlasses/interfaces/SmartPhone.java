package ua.zp.bainacad.lab15.сlasses.interfaces;


/**
 * This class demonstrates applying interfaces and give <b>SmartPhone</b> additional functions of {@link Caller} and {@link EmailSender}
 *
 * @author Maxim Deyenkov
 * @see Caller
 * @see EmailSender
 */
public class SmartPhone implements Caller, EmailSender {

    @Override
    public void call() {
        System.out.println("Выбираем контакт из меню, звоним");
    }

    /**
     * Edit mail
     *
     * @param mail body of the mail
     * @return edited body of the mail
     */
    @Override
    public String editMail(String mail) {
        mail = "{ " + mail + " } edited Mail on SmartPhone";
        return mail;
    }

    /**
     * Development of mail
     *
     * @param mail transmitted string that contains the text of the mail
     * @return created body of the mail
     */
    @Override
    public String createMail(String mail) {
        mail = "{ " + mail + " } created Mail on SmartPhone";
        return mail;
    }

    /**
     * Sent the mail
     *
     * @param mail body of the mail
     */
    @Override
    public void sendMail(String mail) {
        mail = "{ " + mail + " } Mail send by SmartPhone";
        System.out.println(mail);
    }
}
