import java.io.*;

class FileAppend{

	public static void main(String[] args){

		try{

			FileWriter fw=new FileWriter("FileAppendSample.txt",true);
			fw.write("Appending the data...but the one piece is still realllll");
			fw.close();
			System.out.println("Appended successfully");

		}catch(Exception e){}

	}

}