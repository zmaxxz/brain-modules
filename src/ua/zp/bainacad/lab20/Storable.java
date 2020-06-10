package ua.zp.bainacad.lab20;

public interface Storable<S> {

    S read();

    void write(S data);

    Type getType();
}
