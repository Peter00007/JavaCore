package main.java.com.javacore.chapter01.StackExample;

/**
 * Created by User on 26.01.2019.
 */
public class main {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack2:");
        for (int i = 10; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
