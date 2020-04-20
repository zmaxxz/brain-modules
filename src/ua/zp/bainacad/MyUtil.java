package ua.zp.bainacad;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyUtil {
    private MyUtil() {
    }

    public static <T> T[] addObjectToArray(T[] arrayObject, T addObject) {

        for (int i = 0; i < arrayObject.length; i++) {
            if (arrayObject[i]==null){
                arrayObject[i]=addObject;
                return arrayObject;
            }
        }
        arrayObject = Arrays.copyOf(arrayObject, arrayObject.length + 1);

        arrayObject[arrayObject.length - 1] = addObject;
        return arrayObject;


    }

    public static <T> void printArray(T[] arrayObject) {
        System.out.println(arrayObject.getClass().getSimpleName());
        for (int i = 0; i < arrayObject.length; i++) {
            System.out.println(arrayObject[i].toString());
        }
        System.out.println();
    }

    public static <T> void printArrayList(ArrayList<T> arrayObject) {
        if (arrayObject.size() == 0) {
            System.out.println("ArrayList<>=null");
            return;
        }
        System.out.println("ArrayList<"+arrayObject.get(0).getClass().getSimpleName()+">");

        for (int i = 0; i < arrayObject.size(); i++) {
            System.out.println(arrayObject.get(i).toString());
        }
        System.out.println();
    }

    public static <T,U> int getIdFromArrayObjectByObject(T[] arrayObject, U objectFind) {
        for (int i = 0; i < arrayObject.length; i++) {
            if(arrayObject[i]!=null) {
                if (arrayObject[i].hashCode() == objectFind.hashCode()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static <T,U> int getIdFromArrayObjectByClass(T[] arrayObject, U classFind) {
        for (int i = 0; i < arrayObject.length; i++) {
            if (arrayObject[i].getClass()==classFind)
                return i;
        }
        return -1;
    }
}
