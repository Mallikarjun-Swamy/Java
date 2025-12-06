package multiThreading;

import java.time.Instant;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        Thread mythread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Instant.now());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    System.out.println("Thread Interrupted");
                }
            }
        });

        mythread.start();
        mythread.join();
        System.out.println("Main Thread Executed ");
    }


}
