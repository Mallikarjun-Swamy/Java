package multiThreading;

public class SynchronizedThreads {


    public static void main(String[] args) {

        MyDemo1 t1 = new MyDemo1();
        t1.setName("T1");
        MyDemo1 t2 = new MyDemo1();
        t2.setName("T2");

        synchronized (t1){
            t1.start();
        }
        t2.callAddress("Hello");
    }



}

class MyDemo1 extends Thread {


    String name = "Danny";

   synchronized void callName(String name){
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }

    void callAddress(String name){
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }

    public void run(){
        callName(name);
    }

}



