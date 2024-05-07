package MULTITHREAD;

class DocCheck extends Thread{
    public void run(){
        System.out.println("Document checking starting");
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Documents verified");
    }
}

class writtenTest extends Thread{
    public void run(){
        System.out.println("Written test started");
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Written test completed");
    }
}

class drivingTest extends Thread{
    public void run(){
        System.out.println("Driving test started");
        try{
            Thread.sleep(7000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Driving test completed");
    }
}


public class joinThread extends Thread{
    public static void main(String[] args) throws InterruptedException {

        DocCheck doc = new DocCheck();
        doc.start();
        doc.join();

        writtenTest wt = new writtenTest();
        wt.start();
        wt.join();

        drivingTest dt = new drivingTest();
        dt.start();

    }
}