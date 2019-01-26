package main.java.com.javacore.chapter01.ClassExample2;

/**
 * Created by User on 26.01.2019.
 */
public class main {
    public static void main(String[] args) {
        Test ob1 = new Test(10,1);
        Test ob2 = new Test(10,1);
        Test ob3 = new Test(1,2);
        Test testclone = new Test(ob1);

        System.out.println("Equals = " + ob1.equals(ob2));
        System.out.println("Equals = " + ob1.equals(ob3));
        System.out.println(testclone.a + "  " + testclone.b);
    }
}
