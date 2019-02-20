package main.java.com.javacore.chapter3;

/**
 * Created by User on 20.02.2019.
 */
public class Example1 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 10 / d;
        } catch (ArithmeticException e) {
            System.out.println("Exeption -" + e);
        }
    }
}
