package main.java.com.javacore.chapter3;

/**
 * Created by User on 20.02.2019.
 */
public class Example2 {
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("" + e);
        }
        System.out.println("Continue");
    }
}
