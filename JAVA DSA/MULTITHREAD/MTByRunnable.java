package MULTITHREAD;
public class MTByRunnable implements Runnable {

    public void run(){
        System.out.println("Subprocess 1");
    }

    public static void main(String[] args) {
        MTByRunnable obj =  new MTByRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
