package main.java.com.javacore.chapter01.ClassExample2;

/**
 * Created by User on 26.01.2019.
 */
public class Test {
    int a, b;
    Test (int t, int m) {
        a = t;
        b = m;
    }

    Test(Test test) {
        a = test.a;
        b = test.b;
    }

    boolean equals (Test o) {
        if (o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}
