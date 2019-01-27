package main.java.com.javacore.chapter01.InterfaceEx2;

/**
 * Created by User on 27.01.2019.
 */
public class main {
    public static void main(String[] args) {
        A.Nested nested = new B();

        if (nested.isNotNegative(5))
            System.out.println("Positive mark");
        if (nested.isNotNegative(-1))
            System.out.println("Error");

    }
}
