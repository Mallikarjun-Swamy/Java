package multiThreading;

public class ThreadCreationWays {

    public static void main(String[] args) {

        //1. Create a thread using Thread class
        //  MyThread thread = new MyThread();
        //  thread.start();

        //2. Create a thread using Runnable Interface (before Java 8)
//        MyClass myClass = new MyClass();
//        Thread myThread = new Thread(myClass);
//        myThread.start();
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Main Thread : " + i );
//        }

//2. Create a thread using Runnable Interface (After Java 8)

        Runnable runnableThread = () -> {
            for (int i=0; i<=5; i++){
                System.out.println("Child Thread Using Java 8 " + i );
            }
        };

        new Thread(runnableThread).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i );
        }

    }
}

//1. Create a thread using Thread class
class MyThread extends Thread {

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread Executed: " + i);
        }
    }
}

//2. Create a thread using Runnable Interface

class MyClass implements Runnable {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread Executed: " + i);
        }
    }
}