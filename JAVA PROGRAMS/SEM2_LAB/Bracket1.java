package SEM2_LAB;

class Print {
	public void printBracket(String name) {

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

class MakeThread implements Runnable {

	String name;
	Print resouce;

	MakeThread(String name, Print resouce) {

		this.name = name;
		this.resouce = resouce;
		new Thread(this).start();

	}

	public void run() {

		resouce.printBracket(name);

	}
}

public class Bracket1 {
	public static void main(String args[]) {

		Print resouce = new Print();

		new MakeThread("Aakash", resouce);
		new MakeThread("Luffy", resouce);
		new MakeThread("Zoro", resouce);

	}
}