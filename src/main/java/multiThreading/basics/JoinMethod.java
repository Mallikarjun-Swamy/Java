package multiThreading.basics;

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();

        //Type 1 . Using Lambda Expression
        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                try {
                    main.join(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello I am Child Thread");
            }
        };
// ------------------------------------------------------------------------------------------------------------------

//        //Type 2 . Anonymous Inner Class

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    try {
//                        main.join();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Hello I am Child Thread");
//                }
//            }
//        };

//----------------------------------------------------------------------------------------------------------


//        //Type 3 . Runnable Implemented class Object
//        MyClass1 myClass = new MyClass1();
//        myClass.m = Thread.currentThread(); //passing reference of main Tharead
//        Thread thread = new Thread(myClass); // child thread created Main Thread

 //-----------------------------------------------------------------------
        //Common for all type

        Thread thread = new Thread(r);
        thread.start();  //Child thread started

        for (int i = 0; i < 100; i++) {
            System.out.println("Hello, I am Main Thread");
        }

    }

}

class MyClass1 implements Runnable {
    Thread m;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                m.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello I am Child Thread");
        }
    }
}
