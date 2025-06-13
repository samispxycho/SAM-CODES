package SEM2_LAB.ONE_NIGHT_B4_SEMS;

class SubThread extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread of SubThread class: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class trash11 extends Thread {

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread of trash11 class: " + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
            }
        }
    }

    public synchronized static void main(String[] args) {

        trash11 obj = new trash11();
        obj.start();

        SubThread obj1 = new SubThread();
        obj1.start();

    }
}
