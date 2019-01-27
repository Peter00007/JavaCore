package main.java.com.javacore.chapter01.InterfaceClass;

/**
 * Created by User on 27.01.2019.
 */
public class main {
    public static void main(String[] args) {
        Call sq = new Square();
        Square square = new Square();
        sq.call(2);
        square.message("success");
    }
}
