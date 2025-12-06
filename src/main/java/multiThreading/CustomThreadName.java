package multiThreading;

public class CustomThreadName {

    public static void main(String[] args) {
        Thread myThread = new Thread(()->{
            System.out.println("Child Thread Name before Name Change : " + Thread.currentThread().getName());
            Thread.currentThread().setName("Worker-1");
            System.out.println("Child Thread name after Name Change : "+ Thread.currentThread().getName());
        });

        myThread.start();
        System.out.println("Main Thread Name : "+Thread.currentThread().getName());
        myThread.setName("Worker - 1 Thread");

    }

}
