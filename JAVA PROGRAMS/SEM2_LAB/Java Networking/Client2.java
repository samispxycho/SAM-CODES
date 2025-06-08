import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client2{

	public static void main(String[] args){

		try{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name=sc.nextLine();

			System.out.println("Enter your fav anime: ");
			String fav=sc.nextLine();			

			Socket socket2=new Socket("LAPTOP-3ETFC8KL",5002);

			DataOutputStream d1=new DataOutputStream(socket2.getOutputStream());
			d1.writeUTF("My name is "+name+" and my fav anime is "+fav);
			d1.flush();

			DataInputStream d2=new DataInputStream(socket2.getInputStream());
			String reply=d2.readUTF();
			System.out.println("Server replied: "+reply);

			d1.close();
			d2.close();
			socket2.close();						

		}catch(Exception e){}
	
	}

}