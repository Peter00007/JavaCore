package main.java.com.javacore.chapter02;

import java.io.*;
import java.util.Properties;

/**
 * Created by User on 09.02.2019.
 */
public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
        }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Помилка зчитування файлу");
        }
        do {
            System.out.println("Введіть імя" + "('вихід'): ");
            name = bf.readLine();
            if (name.equals("вихід"))
                continue;
            System.out.println("Введіть номер:");
            number = bf.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("вихід"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонна книга");
            fout.close();
        }

        do {
            System.out.println("Введіть імя для пошуку" + "('вихід' для завершення): ");
        name = bf.readLine();
        if (name.equals("вихід"))
            continue;
        number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("вихід"));
    }
}
