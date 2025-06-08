import java.io.*;
import java.net.*;

class Server1{

	public static void main(String[] args){

		try{
			ServerSocket serverSocket1 = new ServerSocket(5000);
			System.out.println("Waiting for client....");
			
			Socket socket1=serverSocket1.accept();
			System.out.println("Client Connected");

			DataInputStream d1=new DataInputStream(socket1.getInputStream());
			String recieved=d1.readUTF();
			System.out.println("Recieved: "+recieved);

			DataOutputStream d2=new DataOutputStream(socket1.getOutputStream());
			d2.writeUTF("Good morning Client, Server this side");
			d2.flush();

			d1.close();
			d2.close();
			socket1.close();
			serverSocket1.close();

		}catch(Exception e){}

	}
	
}