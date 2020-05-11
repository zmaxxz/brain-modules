package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This abstract class gives a minimal description of some device
 * <p>
 * like <b>Device name</b> & <b>Device serial number</b>
 * <p>
 * and give a potential to <b>turn on</b> & <b>turn off</b> the device
 *
 * @author Maxim Deyenkov
 */
public abstract class AbstractDevice {
    /**
     * Device name
     */
    private String name;
    /**
     * Device serial number
     */
    private Integer serial;

    /**
     * The default constructor {@linkplain #powerOn() turns on} the device
     */
    protected AbstractDevice() {
        powerOn();
    }

    /**
     * Construct the <b>AbstractDevice</b> with parameters
     *
     * @param name   Device name
     * @param serial Device serial number
     */
    protected AbstractDevice(String name, Integer serial) {
        this();
        this.name = name;
        this.serial = serial;
    }

    /**
     * <b>Turn on</b> the device
     */
    protected abstract void powerOn();

    /**
     * <b>Turn off</b> the device
     */
    protected abstract void powerOff();

    /**
     * Get <b>name</b>
     *
     * @return {@linkplain #name Device name}
     */
    protected String getName() {
        return name;
    }

    /**
     * Set <b>name</b>
     *
     * @param name {@linkplain #name Device name}
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * Get <b>serial</b>
     *
     * @return {@linkplain #serial Device serial number}
     */
    protected Integer getSerial() {
        return serial;
    }

    /**
     * Set <b>serial</b>
     *
     * @param serial {@linkplain #serial Device serial number}
     */
    protected void setSerial(Integer serial) {
        this.serial = serial;
    }
}
