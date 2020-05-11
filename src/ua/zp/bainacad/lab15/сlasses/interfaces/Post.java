package ua.zp.bainacad.lab15.сlasses.interfaces;

/**
 * This class demonstrates applying interfaces and give <b>Post</b> additional functions of {@link MailSender}
 *
 * @author Maxim Deyenkov
 * @see MailSender
 */
public class Post implements MailSender {
    /**
     * Development of mail
     *
     * @param mail transmitted string that contains the text of the mail
     * @return created body of the mail
     */
    @Override
    public String createMail(String mail) {
        mail = "Пишем письмо от руки { " + mail + " }";
        return mail;
    }

    /**
     * Sent the mail
     *
     * @param mail body of the mail
     */
    @Override
    public void sendMail(String mail) {
        System.out.println("Вкладываем письмо в конверт { " + mail + " } запечатываем и отправляем.");
    }
}
