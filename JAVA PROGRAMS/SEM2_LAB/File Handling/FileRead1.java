import java.io.*;

class FileRead1{

	public static void main(String[] args){

		try{

			FileReader fr=new FileReader("FileRead1Sample.txt");
			System.out.println("File opened sucessfully\n");

			int ch;
			ch=fr.read();
			while(ch!=-1){
				System.out.print((char)ch);
				ch=fr.read();
			}

			fr.close();	
	
		}catch(Exception e){}

	}

}