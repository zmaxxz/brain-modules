package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This class extends opportunities {@link AbstractCooker} and allows the device to {@linkplain #initTimer Set Timer}
 *
 * @author Maxim Deyenkov
 * @see AbstractCooker
 */
public class Oven extends AbstractCooker {

    /**
     * We can set timer
     * @param timer minutes until completion
     */
    void initTimer (int timer){
        System.out.println("Выставляем таймер на "+timer+"минут");
        cook();
    }
    /**
     * Override method. {@link Oven} begins <b>cook</b>
     */
    @Override
    protected void cook() {
        System.out.println("Печь начинает готовить");
    }
}
