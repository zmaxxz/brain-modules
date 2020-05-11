package ua.zp.bainacad.lab15.сlasses.abstracts;

/**
 * This class extends opportunities {@link AbstractCooker} and allows the device to {@linkplain #switchProgram Switch Program}
 *
 * @author Maxim Deyenkov
 * @see AbstractCooker
 */
public class Multicooker extends AbstractCooker {

    /**
     * We can switch a program
     * @param program some number of program
     */
    public void switchProgram(int program) {
        System.out.println("Выбираем программу №" + program);
        cook();
    }

    /**
     * Override method. {@link Multicooker} begins <b>cook</b>
     */
    @Override
    public void cook() {
        System.out.println("Мультиварка начинает готовить");
    }
}
