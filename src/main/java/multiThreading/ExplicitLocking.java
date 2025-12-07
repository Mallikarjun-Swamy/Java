package multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ExplicitLocking {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        Runnable task1 = ()->{
          sbi.withdraw(50.00);
        };

        Thread thread1 = new Thread(task1, "First Thread");
        Thread thread2 = new Thread(task1, "Second Thread");

        thread1.start();
        thread2.start();
    }


}

class BankAccount {
    private double balance = 100.50;
    private  final Lock lock = new ReentrantLock();

    public  void withdraw (double amount){
        System.out.println("attempting to withdraw amount by " + Thread.currentThread().getName());
        try  {
           if (lock.tryLock(10000, TimeUnit.MILLISECONDS)){
               System.out.println(Thread.currentThread().getName()+" Acquired Lock  - Proceeding to WithDraw " + amount);
               if (balance>=amount){
                   try {
                       Thread.sleep(5000);
                       balance = balance - amount;
                       System.out.println("Withdraw Completed, Remaining balance is : "+ balance);
                   } catch (InterruptedException e){
                       Thread.currentThread().interrupt();
                   }finally {
                       lock.unlock();
                       System.out.println(Thread.currentThread().getName()+" Lock Released");
                   }
               }else {
                   System.out.println("Insufficient Balance");
               }

           }else {
               System.out.println(Thread.currentThread().getName() + " Could not acquire the lock");
           }
        }catch (InterruptedException e){
           Thread.currentThread().interrupt();
        }
    }




}
