import java.io.*;
import java.net.*;

class Server6{

	public static void main(String[] args){

		try{

			ServerSocket ss6=new ServerSocket(5012);
			System.out.println("Waiting for client.....");

			Socket socket6=ss6.accept();
			System.out.println("Client Connected.....");

			DataInputStream d1=new DataInputStream(socket6.getInputStream());
			String msg=d1.readUTF();

			char arr[]=msg.toCharArray();
			int start=0;
			int end=arr.length-1;

			int flag=1;
	
			while(start < end){
				if(arr[start] != arr[end]){
					flag=0;
					break;
				}
				start++;
				end--;
			}

			DataOutputStream d2=new DataOutputStream(socket6.getOutputStream());
			
			if(flag==0){
				d2.writeUTF("String is not Pallindrome...");
				d2.flush();
			}else{
		
				d2.writeUTF("String is Pallindrome...");
				d2.flush();		

			}

			d1.close();
			d2.close();
			socket6.close();
			ss6.close();
			

		}catch(Exception e){}

	}

}