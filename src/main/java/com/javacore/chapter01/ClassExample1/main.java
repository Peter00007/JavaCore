package main.java.com.javacore.chapter01.ClassExample1;

/**
 * Created by User on 26.01.2019.
 */
public class main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;
        Box b3 = new Box();
        int res;

        b1.height = 10;
        b1.width = 20;

        b2.width = 1;
        b2.height = 2;

        double res1 = b1.sum();
        double res2 = b2.sum();
        int k = b1.square(2);
        System.out.println("Dob = " + b3.tik(10,1));
        System.out.println("res1 = " + res1 + " , res2  = " + res2);
        System.out.println("k = " + k);
    }
}
