package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This class extends opportunities {@link Mobile} and allows the device to make {@linkplain SmartPhone#runApp runApp}
 *
 * @author Maxim Deyenkov
 * @see Mobile
 */
public class SmartPhone extends Mobile {

    /**
     * Supported operating system
     */
    private String os;

    /**
     * Construct the <b>SmartPhone</b> with parameters
     *
     * @param name     {@linkplain #AbstractDevice#name (Device name)}
     * @param serial   {@linkplain #AbstractDevice#serial (Device serial number)}
     * @param simCount {@linkplain #Mobile#simCount (Count of sim cards)}
     * @param display  {@linkplain #Mobile#display (Type of display)}
     * @param os       {@linkplain #os Supported operating system}
     */
    public SmartPhone(String name, int serial, int simCount, String display, String os) {
        super(name, serial, simCount, display);
        this.os = os;
    }

    /**
     * SmartPhone <b>run App</b>
     */
    public void runApp() {
        System.out.println("Запускаем приложение.");
    }
}
