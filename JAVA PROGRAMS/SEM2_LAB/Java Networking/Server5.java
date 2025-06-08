import java.io.*;
import java.net.*;

class Server5{

	public static void main(String[] args){

		try{

			ServerSocket ss5=new ServerSocket(5010);
			System.out.println("Waiting for client....");

			Socket socket5=ss5.accept();
			System.out.println("Client connected.....");

			DataInputStream d1=new DataInputStream(socket5.getInputStream());
			String msg=d1.readUTF();
			
			String reply="";
			for(char ele:msg.toCharArray()){
				if(Character.isLetter(ele)){
					reply+=ele;
				}
			}

			DataOutputStream d2=new DataOutputStream(socket5.getOutputStream());
			d2.writeUTF(reply);
			d2.flush();
			
			System.out.println("Data sent successfully");

			d1.close();
			d2.close();
			socket5.close();
			ss5.close();

		}catch(Exception e){}

	}

}