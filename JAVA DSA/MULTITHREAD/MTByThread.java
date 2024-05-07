package MULTITHREAD;
public class MTByThread extends Thread{

    public void run(){
        System.out.println("Subprocess 1");
    }   
    public static void main(String[] args) {
        MTByThread obj = new MTByThread();
        obj.start();
    }
}
