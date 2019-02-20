package main.java.com.javacore.chapter3.MethNestTry;

/**
 * Created by User on 20.02.2019.
 */
public class NestTry {
    static void nestTry(int a) {
            try {
                if (a == 1){
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("e = " + e);
            }
        }
    }
