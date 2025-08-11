import java.io.*;


public class FileThrows {
    public static void main(String[] args)throws IOException
	{
		File f1=new File("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\Java Stuff\\abc.txt");
		
		if(f1.createNewFile())
		{
			System.out.println("File successfully created.");
		}		
		else
		{
			System.out.println("File already exist.");
		}
	}
}
