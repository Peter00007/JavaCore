package main.java.com.javacore.chapter02.ExComparator;

import java.util.Comparator;

/**
 * Created by User on 09.02.2019.
 */
public class TComp implements Comparator<String> {
        public int compare(String aStr, String bStr) {
            int i, j, k;

            i = aStr.lastIndexOf(' ');
            j = bStr.lastIndexOf(' ');
            k = aStr.substring(i).compareTo(bStr.substring(j));
            if (k == 0)
                return aStr.compareTo(bStr);
            return k;
        }
}
