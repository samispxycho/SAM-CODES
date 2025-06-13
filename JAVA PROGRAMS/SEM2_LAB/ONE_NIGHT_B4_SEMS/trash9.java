package SEM2_LAB.ONE_NIGHT_B4_SEMS;

public class trash9 extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread running of run method: "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        
        trash9 obj=new trash9();
        obj.start();

        for(int i=1;i<=5;i++){
            System.out.println("Thread running of main method: "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }

    }
}
