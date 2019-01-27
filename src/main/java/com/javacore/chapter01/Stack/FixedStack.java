package main.java.com.javacore.chapter01.Stack;

/**
 * Created by User on 27.01.2019.
 */
public class FixedStack implements IntStack{
    private int stck[];
    private int tos;

    FixedStack (int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack not download");
            return 0;
        }
        else return stck[tos--];
    }
}
