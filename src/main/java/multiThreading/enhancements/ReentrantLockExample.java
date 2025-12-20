package multiThreading.enhancements;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    final ReentrantLock lock = new ReentrantLock();

    public void outerMethod (){
        try {
            lock.lock();
            System.out.println("I am in Outer method");
            System.out.println("IsLocked : "+lock.isLocked());
            System.out.println("Lock Count " + lock.getHoldCount());
            innerMethod();
        }finally {
            lock.unlock();
            System.out.println("lock released and now Lock count is " + lock.getHoldCount());
            System.out.println("Outer completed");
        }
    }

    public void innerMethod (){
        try {
            lock.lock();

            System.out.println("Inner method called");
            System.out.println("IsLocked Again: "+lock.isLocked());
            System.out.println("Lock Count " + lock.getHoldCount());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("Inner completed");
            System.out.println("lock released and now Lock count is " + lock.getHoldCount());
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample obj1 = new ReentrantLockExample();
        obj1.outerMethod();
    }
}
