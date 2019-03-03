package main.java.com.javacore.chapter03.myexception;

/**
 * Created by User on 21.02.2019.
 */
public class main {
    static void compute(int a) throws MyException {
        System.out.println("Викликаний метод (" + a + ") ");

        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальне завершення");
    }

    public static void main(String[] args) {
        try {
                compute(1);
                compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачене повідомлення  " + e);
        }
    }
}
