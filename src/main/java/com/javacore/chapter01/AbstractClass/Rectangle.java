package main.java.com.javacore.chapter01.AbstractClass;

class Rectangle extends Figure {
    Rectangle(int r, int t) {
        super(r, t);
    }

    int area() {
        //System.out.println("Area :");
        return a * b * a * b;
    }
}
