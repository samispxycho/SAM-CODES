import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client4{

	public static void main(String[] args){

		try{

			Scanner sc=new Scanner(System.in);

			Socket socket4=new Socket("LAPTOP-3ETFC8KL",5007);
			
			DataOutputStream d1=new DataOutputStream(socket4.getOutputStream());
			DataInputStream d2=new DataInputStream(socket4.getInputStream());

			String str1="";
			String str2="";	

			while(!str1.equals("exit")){
			
				System.out.print("\nWrite message to Server: ");
				str1=sc.nextLine();
				d1.writeUTF(str1);
				d1.flush();
								
				str2=d2.readUTF();
				System.out.println("Recieved: "+str2);				
			}


			d1.close();
			d2.close();
			socket4.close();
			
		
		}catch(Exception e){}

	}
}