package SEM2_LAB.ONE_NIGHT_B4_SEMS;

class printName {
    public void pname(String name) {
        synchronized (this) {
            System.out.print("[ " + name);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(" ]");
        }
    }
}

class MyThread10 extends Thread {
    String name;
    printName obj;

    MyThread10(String name, printName obj) {
        this.name = name;
        this.obj = obj;

        start();
    }

    public void run() {
        obj.pname(name);
    }

}

public class trash15 {
    public static void main(String[] args) {
        printName obj = new printName();
        new MyThread10("Sameer", obj);
        new MyThread10("Luffy", obj);
        new MyThread10("Law", obj);
    }
}
