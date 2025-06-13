package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.io.*;
import java.net.*;

public class trash7a {
    public static void main(String[] args) {
        
        try{

            Socket socketA=new Socket("localhost",2004);

            String str="one piece";

            DataOutputStream d1=new DataOutputStream(socketA.getOutputStream());
            d1.writeUTF(str);
            d1.flush();

            DataInputStream d2=new DataInputStream(socketA.getInputStream());
            String reply=d2.readUTF();
            System.out.println(reply);

            d1.close();
            d2.close();
            socketA.close();

        }catch(Exception e){}

    }
}
