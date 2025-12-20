package multiThreading.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class SyncWishingExample {
    public static void main(String[] args) {
        Wish w = new Wish();

        Runnable runnable1 = () -> w.wish("Dhoni");
        Runnable runnable2 = () -> w.wish("Kohli");

        Thread thread2 = new Thread(runnable2);
        Thread thread1 = new Thread(runnable1);

        thread1.start();
        thread2.start();
    }

}

class Wish {

    ReentrantLock lock = new ReentrantLock();

    void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Good morning, ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name);
        }

    }
}