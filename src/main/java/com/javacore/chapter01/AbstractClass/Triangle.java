package main.java.com.javacore.chapter01.AbstractClass;

/**
 * Created by User on 27.01.2019.
 */
public class Triangle extends Figure{
    Triangle(int r,int t) {
        super(r, t);
    }

    int area() {
        //System.out.println("Area : ");
        return a * b;
    }
}
