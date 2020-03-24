package ua.zp.brainacad;


import java.util.Arrays;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray; // TODO init it's array by new with size 4.
        firstArray = new float[4];

        // TODO insert some value to start of array and to end of array.
        firstArray[0] = 3.14f;
        firstArray[3] = firstArray[0] * 3;

        int[] intArray; // TODO init and fill it's array with any values. Use {} syntax.
        intArray = new int[]{1, -8, 3, 4, 8, -2, 0, 10, -6};

        // 1.2)
        int[] intArrayCopy = {}; // TODO copy "intArray". Use copyOf...
        intArrayCopy = Arrays.copyOf(intArray, intArray.length);

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));
        //[-8, -6, -2, 0, 1, 3, 4, 8, 10]

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        System.out.println(Arrays.equals(intArray, intArrayCopy) ? "Arrays equals" : "Arrays not equals");
        //Arrays not equals

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        //1 3 5 7 8 6 4 2 0

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sumTestArray = 0;
        for (int i = 0; i < testArray.length; i++) {
            sumTestArray += testArray[i];
        }
        System.out.println("\nsum of testArray - " + sumTestArray);
        //sum of testArray - 36

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int sumOddTestArray = 0;
        for (int value : testArray) {
            if (value % 2 == 0) {
                sumOddTestArray += value;
            }
        }
        System.out.println("sum of odd testArray - " + sumOddTestArray);
        //sum of odd testArray - 20

        // 2.3)
        // TODO find max value in array.
        int max = testArray[0];
        for (int value : testArray) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("max of testArray = " + max);
        //max of testArray = 8

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int myInt[][] = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
        for (int i = 0; i < myInt.length; i++) {
            for (int j = 0; j < myInt[i].length; j++) {
                myInt[i][j] = i + j;
                System.out.print(myInt[i][j] + "\t");
            }
            System.out.println();
        }
        /*
            0	1	2	3
            1	2	3	4
            2	3	4	5
         */

        //3.3
        // TODO calc sum of all array elements and print result.
        int sumMyInt = 0;
        for (int i = 0; i < myInt.length; i++) {
            for (int j = 0; j < myInt[i].length; j++) {
                sumMyInt += myInt[i][j];
            }
        }
        System.out.println("sumMyInt = " + sumMyInt);
        //sumMyInt = 30

        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               // myInt[i][j] = i + j;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        long maxMatrix = matrix[0][0];
        long minMatrix = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (2 < i && i <= 5 && (j + 1) % 3 == 0) {
                    if (maxMatrix < matrix[i][j]) {
                        maxMatrix = matrix[i][j];
                    }
                    else if (minMatrix > matrix[i][j]){
                        minMatrix = matrix[i][j];
                    }
                }
            }
        }
        sum = (int) (maxMatrix + minMatrix);
        System.out.println(sum);
        //7
    }
}
