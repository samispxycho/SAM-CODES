package SEM2_LAB;

class Printstr{
    void print(String str){
        System.out.print("["+str);
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
        System.out.println("]");
    }
}

class Inter extends Thread{
    String str;
    Printstr obj;
    Inter(String str,Printstr obj){
        this.str=str;
        this.obj=obj;
        start();
    }
    public void run(){
        synchronized(obj){
            obj.print(str);
        }
        
    }
}

public class Synchro {
    public static void main(String[] args) {
        Printstr obj=new Printstr();
        Inter i1=new Inter("Sameer", obj);
        Inter i2=new Inter("Upadhyay", obj);
    }
}
