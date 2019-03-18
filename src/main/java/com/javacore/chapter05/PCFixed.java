package main.java.com.javacore.chapter05;



class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
            wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
            wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.n = n;
        valueSet = true;
        System.out.println(n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer (Q q) {
        this.q = q;
        new Thread(this, "Postavshuk").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Potr").start();
    }


    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
    }
}

