package main.java.com.javacore.chapter02.ExComparatorTwo;

import java.util.*;

/**
 * Created by User on 09.02.2019.
 */
public class main {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> comLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<String, Double>(comLastThenFirst);

        tm.put("Q D", new Double(20));
        tm.put("S B", new Double(30));
        tm.put("A D", new Double(30));

        Set<Map.Entry<String, Double>> tree = tm.entrySet();

        for (Map.Entry<String, Double> me : tree) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double bal = tm.get("Q D");
        tm.put("Q D", bal + 1000);
        System.out.println("New Q D = " + tm.get("Q D"));
        int a[] = new int[]{4, 2, 3, 1};
        //Arrays.fill(a , 2);
        /*System.out.println(Arrays.binarySearch(a, 0));
        int b[] = Arrays.copyOfRange(a, 1, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Vector<Integer> vector = new Vector<Integer>(3, 2);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector.capacity() + "  " + vector.size());
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }*/
    }
}
