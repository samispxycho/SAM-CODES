package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class trash12 {
    public static void main(String[] args) {
        
        try{

            //creating a file
            File file=new File("trash12.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }

            //writing into the file
            FileWriter writer=new FileWriter("trash12.txt");
            writer.write("I am writing into the file...THE ONE PIECE IS REAL");
            System.out.println("Data entered successfully in the file");
            writer.close();

            //reading from the file
            FileReader reader=new FileReader("trash12.txt");
            int i=reader.read();
            while(i!=-1){
                System.out.print((char)i);
                i=reader.read();
            }
            System.out.println("\nData read successfully");
            reader.close();

            //writing using BufferedWriter
            BufferedWriter bw=new BufferedWriter(new FileWriter("trash12.txt"));
            bw.write("This data is getting inserted using buffered writer");
            System.out.println("Data entered");
            bw.close();

            //reading through BufferedReader
            BufferedReader br=new BufferedReader(new FileReader("trash12.txt"));
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            System.out.println("Data reading complete");
            br.close();

            //deleting file
            if(file.delete()){
                System.out.println("File deleted successfully");
            }

        }catch(Exception e){}

    }
}
