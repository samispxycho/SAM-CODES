package MULTITHREAD;
public class yieldThread extends Thread{

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Run method");
        }
    }

    public static void main(String[] args) {
        Thread.yield(); //output may vary everytime
        yieldThread t1 = new yieldThread();
        t1.start();
        for(int i=0;i<=5;i++){
            System.out.println("Main method");
        }
    }
}
//Depends on whether Thread scheduler will accept the hint or ignore it.