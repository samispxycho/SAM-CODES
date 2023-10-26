public class interuptThread extends Thread{

    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println("Run method");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        interuptThread t1 = new interuptThread();
        t1.start();
        t1.interrupt();
    }
}
