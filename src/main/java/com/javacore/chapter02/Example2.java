package main.java.com.javacore.chapter02;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by User on 09.02.2019.
 */
public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<String>();

        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("S");
        a1.addLast("X");
        a1.addFirst("A1");
        a1.addFirst("A2");

        System.out.println("Empty:" + a1);

        a1.remove("D");
        a1.remove(3);
        System.out.println("New empty:" + a1);

        a1.removeFirst();
        a1.removeLast();
        System.out.println("New empty:" + a1);

        String val = a1.get(2);
        a1.set(1, val + " +");

        System.out.println("New empty:" + a1);


        HashSet<String> str = new HashSet<String>();

        str.add("A");
        str.add("A");
        str.add("A1");
        str.add("d");
        System.out.println(str);

        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        arrayDeque.push("D");
        System.out.println();
        while (arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop() + " ");
        System.out.println();
        System.out.println(arrayDeque);
    }
}
