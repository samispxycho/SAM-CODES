import java.io.*;

public class CopyData {
    public static void main(String[] args)throws IOException
	{
		FileInputStream r1=new FileInputStream("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\sam.txt");
		FileOutputStream w1=new FileOutputStream("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\samispxycho.txt");
			
		int i;
		while((i=r1.read())!=-1)
		{
			w1.write((char)i);
		}
		System.out.println("File data was successfully copied.");
	}
}
