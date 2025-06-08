import java.net.*;
import java.io.*;

class Sever3{

	public static void main(String[] args){

		try{

			ServerSocket ss3=new ServerSocket(5005);
			System.out.println("Waiting for client to connect.....");
	
			Socket socket3=ss3.accept();
			System.out.println("Client Connected.....");
	
			DataInputStream d1=new DataInputStream(socket3.getInputStream());
			InetAddress ina=socket3.getInetAddress();
			String ipClient=ina.getHostAddress();

			String first_oclet="";
			int i=0;
			char ch=ipClient.charAt(i);

			while(ch!='.'){
				first_oclet+=ch;
				i+=1;		
				ch=ipClient.charAt(i);
			}

			int num=Integer.parseInt(first_oclet);
			String finalMsg="";

			if(num < 128){
				finalMsg="Class A";
			}else if(num < 192){
				finalMsg="Class B";
			}else if(num<224){
				finalMsg="Class C";
			}else if(num < 240){
				finalMsg="Class D";
			}else{
				finalMsg="Class E";
			}

			DataOutputStream d2=new DataOutputStream(socket3.getOutputStream());
			d2.writeUTF(finalMsg);
			d2.flush();

			d1.close();
			d2.close();
			socket3.close();
			ss3.close();

		}catch(Exception e){}
	}

}