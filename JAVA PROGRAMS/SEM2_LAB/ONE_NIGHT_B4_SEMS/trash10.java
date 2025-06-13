package SEM2_LAB.ONE_NIGHT_B4_SEMS;

public class trash10 implements Runnable{

    public void run(){
        // Thread.currentThread().setName("2nd THREAD");
        Thread.currentThread().setPriority(10);
        for(int i=1;i<=5;i++){
            System.out.println("Thread running, run() method: "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        // Thread.currentThread().setName("MAIN THREAD");

        trash10 obj=new trash10();
        Thread t1=new Thread(obj);
        t1.start();

        System.out.println(Thread.currentThread().getName());


        for(int i=1;i<=5;i++){
            System.out.println("Thread running, main() method: "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        } 
    }
}
