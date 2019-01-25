package main.java.com.javacore.chapter01;


public class Example1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2 ;
        int c = 3 ;
        a += 5 ;
        b *= 4 ;
        c += a * b;
        c %= 6;
        System.out.println("C =" + c);
    }
}
