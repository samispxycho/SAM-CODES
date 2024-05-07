package MULTITHREAD;
/*
//Case 1 Single task single thread
public class ThreadCases extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
        ThreadCases obj =  new ThreadCases();
        obj.start();
    }
} 
*/

/*
//Case2 single task, multiple threads
public class ThreadCases extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
        ThreadCases obj1 = new ThreadCases();
        obj1.start();
        ThreadCases obj2 = new ThreadCases();
        obj2.start();
    }
}
*/

//Case 3 multiple task, multiple threads
class Task1 extends Thread{
    public void run(){
        System.out.println("Task 1");
    }
}
class Task2 extends Thread{
    public void run(){
        System.out.println("Task 2");
    }
}
public class ThreadCases{
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.start();
        Task2 t2 = new Task2();
        t2.start();
    }
}
