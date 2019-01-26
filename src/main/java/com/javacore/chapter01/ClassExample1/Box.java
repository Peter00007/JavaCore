package main.java.com.javacore.chapter01.ClassExample1;

/**
 * Created by User on 26.01.2019.
 */
public class Box {
    int height;
    int width;

    double sum() {
        return height * width;
    }

    int square(int i) {
        return i*i;
    }

    int tik (int k, int l) {
        height = k;
        width = l;
        return k * l;
    }
}
