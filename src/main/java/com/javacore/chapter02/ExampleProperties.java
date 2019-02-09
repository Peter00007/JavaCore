package main.java.com.javacore.chapter02;

import java.util.Properties;
import java.util.Set;

/**
 * Created by User on 09.02.2019.
 */
public class ExampleProperties {
    public static void main(String[] args) {
        Properties defProp = new Properties();
        defProp.put("Flo", "Te");
        defProp.put("Che", "Che");

        Properties capitals = new Properties(defProp);
        capitals.put("I", "I");
        capitals.put("IF", "IF");

        Set<?> states = capitals.keySet();
        for (Object name: states) {
            System.out.println(name + "  -  " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();
        String str = capitals.getProperty("Flo");
        System.out.println("Flo  -  " + str);
    }
}
