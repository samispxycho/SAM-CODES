import java.io.*;

class FileDelete{

	public static void main(String[] args){

		try{

			File file=new File("delete.txt");
			if(file.delete()){
				System.out.println("File deleted successfully");
			}else{
				System.out.println("Failed to delete this file");
			}

		
		}catch(Exception e){}

	}

}