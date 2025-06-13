package SEM2_LAB.ONE_NIGHT_B4_SEMS;

class Print{

 	public void printBracket(String name){
		
		synchronized(this){
		System.out.print("[ "+name);
		
		try{Thread.sleep(1000);}catch(Exception e){}

		System.out.println(" ]");

		}
	}
}

class MakeThread extends Thread{
	
	String name;
	Print resouce;
	
	MakeThread(String name,Print resouce){

		this.name=name;
		this.resouce=resouce;
		start();

	}

	public void run(){
		resouce.printBracket(name);	
	}
}

public class trash14{
	public static void main(String args[]){

		Print resouce = new Print();

		new MakeThread("Aakash",resouce);
		new MakeThread("Luffy",resouce);
		new MakeThread("Zoro",resouce);
	
	}
}