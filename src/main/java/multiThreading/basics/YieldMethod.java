package multiThreading.basics;

public class YieldMethod {

    public static void main(String[] args) {


//        // Using Lambda Expressions
//        Runnable r = ()-> {  //executed by child thread
//            for (int i = 0; i < 100; i++) {
//                //Thread.yield();
//                System.out.println("I am Child Thread");
//            }
//        };


        // Using Anonymous Inner Class
        Runnable r = new Runnable() {
            @Override
            public void run() { //executed by child thread
                for (int i = 0; i < 100; i++) {
                //Thread.yield();
                System.out.println("I am Child Thread");
            }
            }
        };


        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 100; i++) {            //executed by Main thread
            System.out.println("I am Main Thread");
        }
    }
}




