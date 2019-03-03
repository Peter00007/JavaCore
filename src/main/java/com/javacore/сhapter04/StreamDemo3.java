package main.java.com.javacore.сhapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phone;
    String email;

    public NamePhoneEmail1(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class NamePhone1 {
    String name;
    String phone;

    public NamePhone1(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail1("Petro", "844", "gmail"));
        myList.add(new NamePhoneEmail1("Petro", "111", "gmail"));

        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phone + " " + a.email);
        });

        System.out.println();

        Stream<NamePhone1> namePhoneStream = myList.stream().map((a) -> new NamePhone1(a.name, a.phone));

        List<NamePhone1> list = namePhoneStream.collect(Collectors.toList());

        for (NamePhone1 e: list) {
            System.out.println(e.name + " " + e.phone);
        }
    }
}
