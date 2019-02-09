package main.java.com.javacore.chapter02;

import java.util.TreeSet;

/**
 * Created by User on 09.02.2019.
 */
public class Example4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(
                (aStr, bStr) -> bStr.compareTo(aStr));
    treeSet.add("A");
    treeSet.add("B");
    treeSet.add("C");
    treeSet.add("Z");
        for (String element: treeSet) {
            System.out.print(element + " ");
        }
    }
    
}
