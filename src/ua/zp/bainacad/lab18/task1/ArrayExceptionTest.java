package ua.zp.bainacad.lab18.task1;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        System.out.println(arrayInt.toString());
        printArray(arrayInt,0,4);
        printArray(arrayInt,1,5);
        printArray(arrayInt,3,7);

    }

    public static void printArray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            try {
                System.out.println(array[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = %d; размер массива = %d\n",i,array.length);
            }
        }
        System.out.println();
    }
}
