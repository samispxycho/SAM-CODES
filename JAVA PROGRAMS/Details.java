import java.io.*;
public class Details {
    public static void main(String[] args)
	{
		File f=new File("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\sam.txt");
		
		if(f.exists())
		{
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canWrite());
			System.out.println(f.length());
		}
		else
		{
			System.out.println("File dosent exists");
		}
	}
}
