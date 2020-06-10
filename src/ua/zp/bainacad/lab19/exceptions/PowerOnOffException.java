package ua.zp.bainacad.lab19.exceptions;

import ua.zp.bainacad.lab19.interfaces.Powered;

public class PowerOnOffException extends RuntimeException {

    public PowerOnOffException() {
        super();
    }

    public PowerOnOffException(String message) {
        super(message);
    }
}
