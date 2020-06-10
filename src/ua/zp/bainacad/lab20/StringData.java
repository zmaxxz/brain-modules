package ua.zp.bainacad.lab20;

public class StringData extends AbstractData {

    Type type;
    String data;


    public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.read().toString();
    }
}
