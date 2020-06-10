package ua.zp.bainacad.lab20;

public class Main {
    public static void main(String[] args) {
        long ID_COUNTER = 0;
        Double d = 123.456789;
        NumericData numericData = new NumericData(ID_COUNTER++);
        DocumentProcessorUtil.build(numericData, d);
        numericData.write(d);
       // DocumentProcessorUtil.convert(numericData);
        System.out.println();
    }
}
