package MULTITHREAD;
public class ThreadMethods extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setName("Itadori");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadMethods obj = new ThreadMethods();
        obj.start();
        obj.setName("Saturo");
        System.out.println(obj.isAlive());
        System.out.println(Thread.currentThread().isAlive());
    }
}
