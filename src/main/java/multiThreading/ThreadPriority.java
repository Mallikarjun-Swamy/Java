package multiThreading;


public class ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-1");
            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-2");
            }
        });

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
        System.out.println("Main thread");
        System.out.println("Main Thread Priority : "+Thread.currentThread().getPriority());
    }

}
