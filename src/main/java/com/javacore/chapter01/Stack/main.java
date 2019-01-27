package main.java.com.javacore.chapter01.Stack;

/**
 * Created by User on 27.01.2019.
 */
public class main {
    public static void main(String[] args) {
        IntStack intStack;
        DynStack dyn = new DynStack(5);
        FixedStack fixedStack = new FixedStack(8);

        intStack = dyn;
        for (int i = 0; i < 12; i++) {
            intStack.push(i);
        }
        intStack = fixedStack;
        for (int i = 0; i < 20; i++) {
            intStack.push(i);
        }
        intStack = dyn;
        for (int i = 0; i < 12; i++) {
            intStack.pop();
        }
        intStack = fixedStack;
        for (int i = 0; i < 20; i++) {
            intStack.pop();
        }

    }
}
