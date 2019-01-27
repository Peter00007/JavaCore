package main.java.com.javacore.chapter01.InterfaceEx2;

/**
 * Created by User on 27.01.2019.
 */
public class B implements A.Nested{

    public boolean isNotNegative(int i) {
        return i<0? false : true;
    }
}
