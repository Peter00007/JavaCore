package main.java.com.javacore.chapter01.VarArgsExample;

/**
 * Created by User on 26.01.2019.
 */
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.println("Count args: " + v.length + " contains: ");
        for (int x: v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
