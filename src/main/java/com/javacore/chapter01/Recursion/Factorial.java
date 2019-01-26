package main.java.com.javacore.chapter01.Recursion;

/**
 * Created by User on 26.01.2019.
 */
public class Factorial {
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
