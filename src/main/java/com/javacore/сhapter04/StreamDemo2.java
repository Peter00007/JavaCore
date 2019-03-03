package main.java.com.javacore.сhapter04;

import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by User on 03.03.2019.
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> myLIst = new ArrayList<>();

        myLIst.add(1.1);
        myLIst.add(1.3);
        myLIst.add(2.5);
        myLIst.add(5.1);

        myLIst.stream().forEach((a) -> {
            System.out.println(a + " ");
        });

        IntStream intStream = myLIst.stream().mapToInt((a) -> (int) Math.ceil(a));

        intStream.forEach((a) -> System.out.println(a + " "));
    }
}
