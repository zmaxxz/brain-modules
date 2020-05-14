package ua.zp.bainacad.lab18.task4;

public class StackOverFlowTest {
    static int count;

    public static void main(String[] args) {
        test();
    }

    static void test(){
        try {
            System.out.println(count++);
            test();
        } catch (StackOverflowError e){

        }

    }
}
