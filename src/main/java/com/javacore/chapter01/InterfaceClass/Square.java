package main.java.com.javacore.chapter01.InterfaceClass;

/**
 * Created by User on 27.01.2019.
 */
public class Square implements Call{
    public void call(int i) {
        System.out.println("i * i = " + Math.pow(i,2));
    }

    void message(String s) {
        System.out.println("Message = " + s);
    }
}
