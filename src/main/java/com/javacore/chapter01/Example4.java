package main.java.com.javacore.chapter01;

/**
 * Created by User on 25.01.2019.
 */
public class Example4 {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Operator break");
                    if (t)
                        break second;
                    System.out.println("not work");
                }
                System.out.println("not work");
            }
            System.out.println("not work, Second");
        }
    }
}
