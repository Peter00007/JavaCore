package main.java.com.javacore.chapter01.StackExample;

/**
 * Created by User on 26.01.2019.
 */
public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos  = -1;
    }

    void push(int item) {
        if (tos==9)
            System.out.println("Stack full");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack not download");
            return 0;
        }
        else
            return stck[tos--];
    }
}
