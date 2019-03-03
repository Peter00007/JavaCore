package main.java.com.javacore.сhapter04;


import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    public NamePhoneEmail(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Petro", "844", "gmail"));
        myList.add(new NamePhoneEmail("Petro", "111", "gmail"));

        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phone + " " + a.email);
        });

        System.out.println();

        Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phone));
        namePhoneStream.forEach((a) -> {
            System.out.println(a.name + " " + a.phone);
        });
    }
}
