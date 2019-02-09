package main.java.com.javacore.chapter02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by User on 09.02.2019.
 */
public class ExampleIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");


        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> litr = arrayList.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        itr = arrayList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
    }
}
