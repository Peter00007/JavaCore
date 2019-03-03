package main.java.com.javacore.chapter03.methnesttry;

/**
 * Created by User on 20.02.2019.
 */
public class main {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 42 / a;
            System.out.println("a = " + a);
            NestTry.nestTry(2);
        } catch (ArithmeticException e) {
            System.out.println("e = " + e);
        }
    }
}
