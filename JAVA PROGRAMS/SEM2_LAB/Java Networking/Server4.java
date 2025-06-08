import java.net.*;
import java.io.*;
import java.util.Scanner;

class Server4{

	public static void main(String[] args){

		try{

			Scanner sc=new Scanner(System.in);

			ServerSocket ss4=new ServerSocket(5007);
			System.out.println("Waiting for client......");

			Socket socket4=ss4.accept();
			System.out.println("Client connected....\n\n");

			DataInputStream d1=new DataInputStream(socket4.getInputStream());
			DataOutputStream d2=new DataOutputStream(socket4.getOutputStream());

			String str1="";
			String str2="";

			while(!str1.equals("exit")){

				str1=(String)d1.readUTF();
				System.out.println("Client sent: "+str1);

				System.out.print("\nEnter response to client: ");
				str2=sc.nextLine();
				d2.writeUTF(str2);
				d2.flush();			

			}	

			d1.close();
			d2.close();
			socket4.close();	
			ss4.close();	
	
		}catch(Exception e){}

	}

}