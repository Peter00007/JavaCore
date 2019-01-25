package main.java.com.javacore.chapter01;

/**
 * Created by User on 25.01.2019.
 */
public class Example2 {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }

        int h = -5;
        int k = h < 0 ? -h: h;
        System.out.println(k);
    }
}
