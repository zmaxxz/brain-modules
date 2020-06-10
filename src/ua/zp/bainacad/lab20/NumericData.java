package ua.zp.bainacad.lab20;

public class NumericData extends AbstractData implements Storable<Number> {

    final static Type type = Type.NUM;
    Number data;


    public NumericData(long id) {
        super(id);
    }

    @Override
    public Number read() {
        return this.data;
    }

    @Override
    public void write(Number data) {
        this.data = data;
    }

    @Override
    public Type getType() {
        return type;
    }
}
