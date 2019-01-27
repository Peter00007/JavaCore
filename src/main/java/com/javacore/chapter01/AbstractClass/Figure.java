package main.java.com.javacore.chapter01.AbstractClass;

/**
 * Created by User on 27.01.2019.
 */
abstract class Figure {
    int a;
    int b;
    Figure(int r,int t) {
        a = r;
        b = t;
    }

    abstract int area();
}
