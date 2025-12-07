package multiThreading;

public class DeadLockExample {

    public static void main(String[] args) {
        NoteBookSmall noteBookSmall = new NoteBookSmall();
        NoteBookBig noteBookBig = new NoteBookBig();
        Pencil pencil = new Pencil(noteBookSmall, noteBookBig);
        Pen pen = new Pen(noteBookSmall, noteBookBig);
        pen.start();
        pencil.start();
    }
}


class Pen extends Thread {

    NoteBookSmall noteBookSmall;
    NoteBookBig noteBookBig;

    Pen(NoteBookSmall noteBookSmall, NoteBookBig noteBookBig){
        this.noteBookSmall = noteBookSmall;
        this.noteBookBig = noteBookBig;
    }

   public void run (){
       try {
           noteBookSmall.write(noteBookBig);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Now reading BigBook");
       noteBookBig.read();
    }

}

class Pencil extends Thread {
    NoteBookSmall noteBookSmall;
    NoteBookBig noteBookBig;

    Pencil(NoteBookSmall noteBookSmall, NoteBookBig noteBookBig){
        this.noteBookSmall = noteBookSmall;
        this.noteBookBig = noteBookBig;
    }

    public void run (){
        try {
          noteBookBig.write(noteBookSmall);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
class NoteBookSmall {

    synchronized void write (NoteBookBig big) throws InterruptedException {
        System.out.println("Lock Acquired for writing in SmallBook by " + Thread.currentThread().getName() );
        System.out.println("Writing in SmallBook by " + Thread.currentThread().getName() );
        Thread.sleep(5000);
        System.out.println("Writing done in SmallBook by " +  Thread.currentThread().getName());
        System.out.println("Lock yet not released by " + Thread.currentThread().getName());
        System.out.println("Trying to read BigBook by " + Thread.currentThread().getName());
        big.read();
    }

    synchronized void read (){
         System.out.println("reading done in SmallBook");
    }
}

class NoteBookBig {
    synchronized void write (NoteBookSmall small) throws InterruptedException {
        System.out.println("Lock Acquired for writing in BigBook by " + Thread.currentThread().getName() );
        System.out.println("Writing in BigBook by " + Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Writing done in BigBook by " + Thread.currentThread().getName());
        System.out.println("Lock yet not released by " + Thread.currentThread().getName());
        System.out.println("Trying to read SmallBook by " + Thread.currentThread().getName());
        small.read();
    }

    synchronized void read (){
                System.out.println("reading done in BigBook");
    }
}