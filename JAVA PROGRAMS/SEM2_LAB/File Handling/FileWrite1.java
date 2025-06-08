import java.io.*;

class FileWrite1{

	public static void main(String[] args){

		try{

			FileWriter fw=new FileWriter("FileWrite1Sample.txt");
			fw.write("Hello this is me writing a file...but the one piece is still real");
			fw.close();
			System.out.println("File written successfully");

		}catch(Exception e){}

	}

}