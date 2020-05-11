package ua.zp.bainacad.lab15.сlasses.interfaces;

/**
 * This interface extends opportunities {@link MailSender} and allows to {@linkplain #editMail Edit Mail}
 *
 * @author Maxim Deyenkov
 * @see MailSender
 */
public interface EmailSender extends MailSender {

    /**
     * Edit mail
     *
     * @param mail body of the mail
     * @return edited body of the mail
     */
    String editMail(String mail);
}
