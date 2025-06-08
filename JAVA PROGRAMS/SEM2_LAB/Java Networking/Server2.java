import java.io.*;
import java.net.*;

class Server2{

	public static void main(String[] args){

		try{

			ServerSocket ss2=new ServerSocket(5002);
			System.out.println("Waiting for client.....");

			Socket socket2=ss2.accept();
			System.out.println("Client Connected...\n");

			DataInputStream d1=new DataInputStream(socket2.getInputStream());
			String msg=d1.readUTF();
			System.out.println("Client said: "+msg);

			DataOutputStream d2=new DataOutputStream(socket2.getOutputStream());
			d2.writeUTF("Thats great! THE ONE PIECE IS REALLLL...");
			d2.flush();

			d1.close();
			d2.close();
			socket2.close();
			ss2.close();

		}catch(Exception e){}

	}


}