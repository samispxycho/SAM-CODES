public class PriorityThreads extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("older main: "+Thread.currentThread().getPriority());
        PriorityThreads obj = new PriorityThreads();
        Thread.currentThread().setPriority(7);
        System.out.println("New main: "+Thread.currentThread().getPriority());
        obj.start();
    }
}
