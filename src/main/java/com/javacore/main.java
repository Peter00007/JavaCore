package main.java.com.javacore;

/**
 * Created by User on 25.01.2019.
 */
public class main {
    public static void main(String[] args) {
        int s = 1;
        int k = 0;
        while (k < 10) {
            k += 2;
            if (k != 6) {
                continue;
            }
            s+= k;
        }
        System.out.println(s);
    }

    class MyException extends Exception {}

    class MyRun extends Throwable {}
    class A {
        void method1() throws MyException {
            throw  new MyException();
        }

        void method2() throws MyRun {
            throw new MyRun();
        }

    }
}
