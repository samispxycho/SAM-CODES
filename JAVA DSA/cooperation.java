public class cooperation extends Thread {

    int total_earning = 0;
    public void run(){
        synchronized(this){
            for(int i=1;i<=10;i++){
                total_earning+=100;
            }
            this.notify();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        cooperation t1 = new cooperation();
        t1.start();
        synchronized(t1){
            t1.wait();   
        }
        System.out.println("Total: "+t1.total_earning);
    }
}
