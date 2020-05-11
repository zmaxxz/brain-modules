package ua.zp.bainacad.lab15.сlasses.interfaces;

/**
 * This interface allows to {@linkplain #createMail create} and {@linkplain #createMail send} the <b>mail</b>
 *
 * @author Maxim Deyenkov
 */
public interface MailSender {
    /**
     * Development of mail
     *
     * @param mail transmitted string that contains the text of the mail
     * @return created body of the mail
     */
    String createMail(String mail);

    /**
     * Sent the mail
     *
     * @param mail body of the mail
     */
    void sendMail(String mail);
}
