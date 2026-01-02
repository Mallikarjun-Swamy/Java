package java8.lambdas;

import java.util.stream.Stream;

public class ThreadUsingLambda {

    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {
            System.out.println("Hello I am In Run Method");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        myThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("I am Main Method");
        }



    }


}
