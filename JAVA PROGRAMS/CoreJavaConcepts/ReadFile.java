import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException
	{
		FileReader r1=new FileReader("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\abc.txt");
		int i;
		while((i=r1.read())!=-1)
		{	
			System.out.print((char)i);
		}
	}
}
