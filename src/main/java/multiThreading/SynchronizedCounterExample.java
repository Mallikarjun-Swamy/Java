package multiThreading;

public class SynchronizedCounterExample {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

//        //Anonymous Inner class
//
//        Runnable myrunnable1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 1000; i++) {
//                    counter.incrementCount();
//                }
//            }
//        };

        //or using java 8

        Runnable myrunnable1 = () -> {
            for (int i = 1; i < 1000; i++) {
                counter.incrementCount();
            }
        };

        Thread thread1 = new Thread(myrunnable1);
        Thread thread2 = new Thread(myrunnable1);

        thread2.start();
        thread1.start();
        System.out.println(counter.getCount());
        thread1.join();
        thread2.join();
        System.out.println(counter.getCount());
    }


}

class Counter {
    int count ;


    public void incrementCount (){
        count++;
    }


    public int getCount() {
        return count;
    }
}


