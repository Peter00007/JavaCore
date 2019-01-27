package main.java.com.javacore.chapter01.AbstractClass;

/**
 * Created by User on 27.01.2019.
 */
public class main {
    public static void main(String[] args) {
        Figure fig;
        Triangle tr = new Triangle(1,2);
        Rectangle r = new Rectangle(2,3);
        fig = tr;
        System.out.println("Area = " + fig.area());
        fig = r;
        System.out.println("Area = " + fig.area());
    }
}
