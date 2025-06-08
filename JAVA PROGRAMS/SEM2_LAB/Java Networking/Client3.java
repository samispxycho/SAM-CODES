import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client3{

	public static void main(String[] args){

		try{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter website name: ");
			String name=sc.nextLine();

			Socket socket3=new Socket("LAPTOP-3ETFC8KL",5005);

			DataOutputStream d1=new DataOutputStream(socket3.getOutputStream());
			d1.writeUTF(name);
			d1.flush();

			DataInputStream d2=new DataInputStream(socket3.getInputStream());
			String reply=d2.readUTF();
			System.out.println("IP address belongs to: "+reply);

			d1.close();
			d2.close();
			socket3.close();

		}catch(Exception e){}	

	}

}