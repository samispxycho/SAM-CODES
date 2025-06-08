import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client6{

	public static void main(String[] args){

		try{

			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string: ");
			String str=sc.nextLine();

			Socket socket6=new Socket("LAPTOP-3ETFC8KL",5012);

			DataOutputStream d1=new DataOutputStream(socket6.getOutputStream());
			d1.writeUTF(str);
			d1.flush();

			DataInputStream d2=new DataInputStream(socket6.getInputStream());
			String reply=d2.readUTF();
			System.out.println(reply);

			d1.close();
			d2.close();
			socket6.close();

		}catch(Exception e){}

	}

}