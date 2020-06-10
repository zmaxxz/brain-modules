package ua.zp.bainacad.lab20;

public class DocumentProcessorUtil<T extends AbstractData & Storable> {

    static long ID_COUNTER=0;

    private DocumentProcessorUtil() {
    }

    public StringData convert(T data) {
        return new StringData(ID_COUNTER++,data.getType(),data);
    }

    public static <T> void build(Storable storeObj, T data){
        storeObj.write(data);
    }

}
