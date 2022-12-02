import java.io.*;

public class RenameFile {
    public static void main(String[] args)throws IOException
	{
		File f1=new File("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\abc.txt");
		File f2=new File("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\sam.txt");
	
		if(f1.exists())
		{
			f1.renameTo(f2);
			System.out.println("File successfully renamed");	
		}
		else
		{
			System.out.println("File does not exist.");	
		}
	}
}
