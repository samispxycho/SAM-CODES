import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException
	{
		FileWriter f1=new FileWriter("C:\\Users\\Sameer Upadhyay\\OneDrive\\Desktop\\FileHandling\\abc.txt");
		f1.write("Java File handling");
		f1.close();
	}
}
