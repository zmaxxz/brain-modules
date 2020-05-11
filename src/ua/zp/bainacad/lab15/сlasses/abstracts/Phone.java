package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This abstract class extends opportunities {@link AbstractDevice} and allows the device to make {@linkplain #call call}
 *
 * @author Maxim Deyenkov
 * @see AbstractDevice
 */
public abstract class Phone extends AbstractDevice {
    /**
     * Construct the <b>Phone</b> with parameters
     *
     * @param name   {@linkplain #AbstractDevice#name (Device name)}
     * @param serial {@linkplain #AbstractDevice#serial (Device serial number)}
     */
    protected Phone(String name, Integer serial) {
        super(name, serial);
    }

    /**
     * Phone make <b>call</b>
     */
    protected abstract void call();
}
