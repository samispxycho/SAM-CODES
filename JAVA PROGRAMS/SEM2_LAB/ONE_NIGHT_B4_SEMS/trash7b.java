package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import java.net.*;
import java.io.*;

public class trash7b {
    public static void main(String[] args) {
        
        try{
            ServerSocket ss=new ServerSocket(2004);
            System.out.println("Waiting for client");

            Socket socketB=ss.accept();
            System.out.println("connection established");

            DataInputStream d1=new DataInputStream(socketB.getInputStream());
            String msg=d1.readUTF();

            String reply=msg.toUpperCase();

            DataOutputStream d2=new DataOutputStream(socketB.getOutputStream());
            d2.writeUTF(reply);
            d2.flush();

            d1.close();
            d2.close();
            socketB.close();
            ss.close();

        }catch(Exception e){}

    }
}
