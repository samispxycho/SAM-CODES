package EXCEPTION_HAND;

public class GarbageCollect {
    public static void main(String[] args) {
        //GarbageCollect a = new GarbageCollect();
        //GarbageCollect b = new GarbageCollect();
        //a=null;b=null;
        System.gc();
    }
    public void finalize(){
        System.out.println("Hello");
    }
}
