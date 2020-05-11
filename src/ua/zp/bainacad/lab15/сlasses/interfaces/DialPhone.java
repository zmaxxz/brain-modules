package ua.zp.bainacad.lab15.сlasses.interfaces;

/**
 * This class demonstrates applying interfaces and give <b>Post</b> additional functions of {@link Caller}
 *
 * @author Maxim Deyenkov
 * @see Caller
 */
public class DialPhone implements Caller {
    /**
     * To make <b>call</b>
     */
    @Override
    public void call() {
        System.out.println("Поднимаем трубку, набираем номер, звоним.");
    }
}
