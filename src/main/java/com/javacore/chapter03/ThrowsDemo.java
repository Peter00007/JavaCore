package main.java.com.javacore.chapter03;

/**
 * Created by User on 20.02.2019.
 */
public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessException {
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        } catch (IllegalAccessException e) {
            System.out.println("e = " + e);
        }
    }
}
