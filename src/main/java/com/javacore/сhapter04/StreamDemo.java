package main.java.com.javacore.сhapter04;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by User on 03.03.2019.
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myLIst = new ArrayList<>();
        myLIst.add(1);
        myLIst.add(2);
        myLIst.add(4);
        myLIst.add(3);
        myLIst.add(6);
        myLIst.add(5);
        myLIst.add(7);

        System.out.println(myLIst);

        Stream<Integer> myStream = myLIst.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println(minVal.get());
        }

        myStream = myLIst.stream();

        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println(maxVal.get());
        }

        Stream<Integer> sortedStream = myLIst.stream().sorted();
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myLIst.stream().sorted().filter((n) -> (n%2) == 1);

        oddVals.forEach((n) -> System.out.println(n + " "));

        System.out.println();

        oddVals = myLIst.stream().filter((n) -> (n%2) == 1).filter((n) -> n >5);
        oddVals.forEach((n) -> System.out.println(n + " "));

        System.out.println();
    }
}
