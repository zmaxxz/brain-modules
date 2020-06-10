package ua.zp.bainacad.lab20;

public abstract class AbstractData {

    private long id = -1;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
