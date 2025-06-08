import java.net.*;
import java.io.*;

class Client1{

	public static void main(String[] args){

		try{

			Socket socket1=new Socket("LAPTOP-3ETFC8KL",5000);	
			
			DataOutputStream d1=new DataOutputStream(socket1.getOutputStream());
			d1.writeUTF("Good Morning");
			d1.flush();

			DataInputStream d2=new DataInputStream(socket1.getInputStream());
			String reply=d2.readUTF();
			System.out.println("Server replied: "+reply);

			d2.close();
			d1.close();
			socket1.close();			

		}catch(Exception e){}

	}

}