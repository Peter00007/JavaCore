package main.java.com.javacore.chapter03;

/**
 * Created by User on 20.02.2019.
 */
public class ThrowDemo {
    static void demothrow() {
        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("Generics");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demothrow();
        } catch (NullPointerException e) {
            System.out.println("Return = " + e);
        }
    }
}
