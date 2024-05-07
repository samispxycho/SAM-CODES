package MULTITHREAD;

public class DaemonThreads extends Thread {

    public void run(){
        System.out.println("Child thread");
    }

    public static void main(String[] args) {
        DaemonThreads t1 = new DaemonThreads();
        System.out.println(t1.isDaemon());
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
        t1.start();
    }
}
