package main.java.com.javacore.chapter02.ExComparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Created by User on 09.02.2019.
 */
public class main {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        tm.put("A D", new Double(20));
        tm.put("A B", new Double(40));
        tm.put("A C", new Double(30));

        Set<Map.Entry<String, Double>> tree = tm.entrySet();

        for (Map.Entry<String, Double> me: tree) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double bal = tm.get("A D");
        tm.put("A D", bal + 1000);
        System.out.println("New A D = " + tm.get("A D"));
    }
}
