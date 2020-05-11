package ua.zp.bainacad.lab15.сlasses.abstracts;


/**
 * Class <b>Mobile</b> extends opportunities {@link Phone}
 * <p>
 * like {@linkplain #simCount Count of sim cards} & {@linkplain #display Type of display}
 *
 * @author Maxim Deyenkov
 * @see Phone
 */
public class Mobile extends Phone {
    /**
     * Count of sim cards
     */
    private int simCount;
    /**
     * Type of display
     */
    private String display;

    /**
     * Construct the <b>Mobile</b> with parameters
     *
     * @param name     {@linkplain #AbstractDevice#name (Device name)}
     * @param serial   {@linkplain #AbstractDevice#serial (Device serial number)}
     * @param simCount {@linkplain #simCount Count of sim cards}
     * @param display  {@linkplain #display Type of display}
     */
    public Mobile(String name, int serial, int simCount, String display) {
        super(name, serial);
        this.simCount = simCount;
        this.display = display;
    }

    /**
     * Override method. {@link Mobile} make <b>call</b>
     */
    @Override
    protected void call() {
        System.out.println("Выбираем контакт из меню, звоним");
    }

    /**
     * Override method. <b>Turn on</b> the {@link Mobile}
     */
    @Override
    protected void powerOn() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон запускается.");
    }

    /**
     * Override method. <b>Turn off</b> the {@link Mobile}
     */
    @Override
    protected void powerOff() {
        System.out.println("Зажимаем кнопку включения. Мобильный телефон выключается.");
    }
}
