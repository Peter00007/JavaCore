package main.java.com.javacore.chapter01;

/**
 * Created by User on 25.01.2019.
 */
public class example5 {
    public static void main(String[] args) {
        outher: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outher;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();

        boolean t = true;
        System.out.println("Go");
        if (t) return;
        System.out.println("Exit");
    }
}
