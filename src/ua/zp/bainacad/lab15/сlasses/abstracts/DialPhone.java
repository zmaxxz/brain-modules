package ua.zp.bainacad.lab15.сlasses.abstracts;


/**
 * Class <b>DialPhone</b> extends opportunities {@link Phone}
 * <p>
 * like {@linkplain #hasAnswerphone can be an Answerphone}
 *
 * @author Maxim Deyenkov
 * @see Phone
 */
public final class DialPhone extends Phone {
    /**
     * <b>DialPhone</b> is Answerphone?
     */
    private boolean hasAnswerphone;

    /**
     * Construct the <b>DialPhone</b> with parameters
     *
     * @param name   {@linkplain #AbstractDevice#name (Device name)}
     * @param serial {@linkplain #AbstractDevice#serial (Device serial number)}
     * @param hasAnswerphone is has function {@linkplain #hasAnswerphone Answerphone}
     */
    public DialPhone(String name, Integer serial, boolean hasAnswerphone) {
        super(name, serial);
        this.hasAnswerphone = hasAnswerphone;
    }

    /**
     * Override method. {@link DialPhone} make <b>call</b>
     */
    @Override
    protected void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }

    /**
     * Override method. <b>turn on</b> the {@link DialPhone}
     */
    @Override
    protected void powerOn() {
        System.out.println("Вставляем штеккер в розетку.");
    }

    /**
     * Override method. <b>turn off</b> the {@link DialPhone}
     */
    @Override
    protected void powerOff() {
        System.out.println("Выдергиваем штеккер. Стационарный телефон тухнет.");
    }

    /**
     * Test Answerphone function
     */
    public void autoAnswer() {
        System.out.println("Стационарный телефон - " + (hasAnswerphone ? " " : " не ") + "автооответчик.");
    }
}
