package main.java.com.javacore.chapter05;

public class NewThread implements Runnable{
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo");
        System.out.println(t);
        t.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread end");
        }
        System.out.println("Thread finish");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread end");
        }
        System.out.println("Main Thread Finish");
    }
}
