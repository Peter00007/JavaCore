package main.java.com.javacore.chapter01.ConstructorExample;

/**
 * Created by User on 27.01.2019.
 */
public class B extends A{
    /*B() {
        System.out.println("In constructor B");
    }*/
    int d;
    B(int k, int m, int b) {
        super(k, m);
        d = b;
    }
    void sum(String msg) {
        System.out.println(msg + " " + d);
    }
}
