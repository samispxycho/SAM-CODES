import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client5{

	public static void main(String[] args){

		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter alphanumeric string: ");
			String str=sc.nextLine();

			Socket socket5=new Socket("LAPTOP-3ETFC8KL",5010);

			DataOutputStream d1=new DataOutputStream(socket5.getOutputStream());
			d1.writeUTF(str);
			d1.flush();

			DataInputStream d2=new DataInputStream(socket5.getInputStream());	
			String reply=d2.readUTF();
			System.out.println("Recieved: "+reply);

			d1.close();
			d2.close();
			socket5.close();		

		}catch(Exception e){}

	}

}