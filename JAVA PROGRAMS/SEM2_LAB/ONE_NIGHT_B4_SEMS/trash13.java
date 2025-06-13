package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.io.FileReader;
import java.io.FileWriter;

public class trash13 {
    public static void main(String[] args) {
        
        try{

            FileReader reader=new FileReader("trash13a.txt");
            FileWriter writer=new FileWriter("trash13b.txt");

            int i=reader.read();
            while(i!=-1){
                char c=(char)i;
                writer.write(c);
                i=reader.read();
            }

            reader.close();
            writer.close();

            System.out.println("Data copied successfully");

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
