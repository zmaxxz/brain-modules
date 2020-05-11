package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This abstract class expands opportunities {@link AbstractDevice} and allows the device to {@linkplain #cook cook}
 *
 * @author Maxim Deyenkov
 * @see AbstractDevice
 */
public abstract class AbstractCooker extends AbstractDevice {
    /**
     * Override method. <b>Turn on</b> the {@link AbstractCooker}
     */
    @Override
    protected void powerOn() {
        System.out.println("Вставляем штеккер в розетку.");
    }

    /**
     * Override method. <b>Turn off</b> the {@link AbstractCooker}
     */
    @Override
    protected void powerOff() {
        System.out.println("Обестачиваем прибор.");
    }

    /**
     * AbstractCooker begins <b>cook</b>
     */
    protected abstract void cook();
}
