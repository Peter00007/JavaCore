package main.java.com.javacore.chapter01;

/**
 * Created by User on 25.01.2019.
 */
public class Example6 {
    public static void main(String[] args) {
        int mas[] = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 5 - 10);
            System.out.print(mas[i] + " ");
        }
    }
}
