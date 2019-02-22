package main.java.com.javacore.it;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by User on 21.02.2019.
 */
public class main {
    public static void main(String[] args) {

        //create Set collection
        Set<Employee> set = new TreeSet<>(new Comp());

        set.add(new FixedPayment(1,"Petro", 200));
        set.add(new HourPayment(2,"Andriy", 10));
        set.add(new FixedPayment(3,"Yura", 200));
        set.add(new FixedPayment(4,"Petro", 300));
        set.add(new FixedPayment(5,"Dima", 2500));
        set.add(new FixedPayment(6,"Artyr", 30066));
        set.add(new FixedPayment(7,"Artem", 30043));
        set.add(new FixedPayment(8,"Artem", 3003));
        set.add(new HourPayment(9,"Dima", 12));
        set.add(new HourPayment(10,"Andriy", 11));
        set.add(new HourPayment(11,"Andriy", 15));
        set.add(new HourPayment(12,"Andriy", 20));

        //output of employees data
        for (Employee element : set) {
            System.out.println(element.getId() + " " + element.getName() + " " + element.averageMonthlySalary());
        }

        //creating an iterator for passing through the collection
        Iterator<Employee> value = set.iterator();

        int i = 0;

        //output of the first five employees
        System.out.println("\nProblem a:");
        while (i < 5 && value.hasNext()) {
            Employee str = value.next();
            System.out.println(str.getId() + " " + str.getName() + " " + str.averageMonthlySalary());
            i++;
        }

        i = 0;

        //output of the last three employees
        System.out.println("\nProblem b:");
        Iterator<Employee> count = set.iterator();
        while (count.hasNext()) {
            Employee str = count.next();
            if (i >= set.size() - 3) {
                System.out.println(str.getId());
            }
            i++;
        }

        //write data to file
        File f = new File("D:\\JavaCourse\\JavaCore\\TreeSet.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee str : set) {
            try {
                writer.write(str + "\r\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------");

        //read data from file
        BufferedReader br = null;
        try {
            String sCurrentLine;
            FileInputStream fr = new FileInputStream("D:\\JavaCourse\\JavaCore\\TreeSet.txt");
            InputStreamReader isr = new InputStreamReader(fr,
                    Charset.forName("UTF-8"));
            br = new BufferedReader(isr);
            while ((sCurrentLine = br.readLine()) != null) {
                String[] nextLine = sCurrentLine.split(" ");
                System.out.println(nextLine);
            }
            System.out.println("Success");
            br.close();
        } catch (IOException e) {
            System.out.println("Exception " + e);
        }
    }
}
