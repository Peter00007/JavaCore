package main.java.com.javacore.chapter02.ExComparatorTwo;

import java.util.Comparator;

/**
 * Created by User on 09.02.2019.
 */
public class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
