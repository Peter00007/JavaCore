package main.java.com.javacore.chapter02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by User on 09.02.2019.
 */
public class Example3 {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();

        hashMap.put("A", new Double(222.2));
        hashMap.put("B", new Double(222.2));
        hashMap.put("C", new Double(222.2));

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hashMap.get("A");
        hashMap.put("A", balance + 1000);
        System.out.println("New A = " + hashMap.get("A"));

        System.out.println();

        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

        treeMap.put("B", new Double(222.2));
        treeMap.put("C", new Double(222.2));
        treeMap.put("C", new Double(123));
        treeMap.put("C", new Double(1));
        treeMap.put("C", new Double(23));
        treeMap.put("C", new Double(21113));

        Set<Map.Entry<String, Double>> tree = treeMap.entrySet();

        for (Map.Entry<String, Double> me: tree) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double bal = treeMap.get("B");
        treeMap.put("B", bal + 1000);
        System.out.println("New B = " + treeMap.get("B"));
    }
}
