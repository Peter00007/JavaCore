package main.java.com.javacore.chapter05;

public class ThreadEx implements Runnable {
    String name;

    Thread t;

    ThreadEx(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println(t);
        t.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 class MultiThread {
    public static void main(String[] args) {
        ThreadEx od1 = new ThreadEx("One");
        ThreadEx od2 = new ThreadEx("Two");
        ThreadEx od3 = new ThreadEx("Three");

        System.out.println(od1.t.getPriority());
        System.out.println(od1.t.getPriority());
        System.out.println(od1.t.getPriority());
        System.out.println(od1.t.isAlive());
        System.out.println(od2.t.isAlive());
        System.out.println(od3.t.isAlive());
        try {
            od1.t.join();
            od2.t.join();
            od3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(od1.t.isAlive());
        System.out.println(od2.t.isAlive());
        System.out.println(od3.t.isAlive());
    }
}
