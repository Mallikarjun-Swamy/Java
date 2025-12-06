package multiThreading;

public class SumCalculation {
    public static void main(String[] args) throws InterruptedException {
        final int[] result = new int[1];

        Thread myThread = new Thread(()->{
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            result[0] = sum;
        });
        myThread.start();
        myThread.join();
        System.out.println("Sum from 1 to 100 is : " + result[0]);
    }
}
