package MULTITHREAD;
public class sleepThread extends Thread{

    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println("Run method");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        sleepThread t1= new sleepThread();
        t1.start();

        try{
            for(int i=1;i<=10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
