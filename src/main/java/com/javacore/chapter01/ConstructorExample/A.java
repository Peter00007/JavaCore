package main.java.com.javacore.chapter01.ConstructorExample;

/**
 * Created by User on 27.01.2019.
 */
public class A {
    /*A() {
        System.out.println("In constructor A");
    }*/
    int i, j;
    A(int k, int m) {
        i = k;
        j = m;
    }

    void sum() {
        System.out.println("i, j = " + i + " " + j);
    }
}
