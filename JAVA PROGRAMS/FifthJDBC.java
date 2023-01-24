//taking input from  the user---->improved version using while loop

import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class FifthJDBC {
    public static void main(String[] args) {
        try 
        {
            //loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection establishment
            String url="jdbc:mysql://localhost:3306/javaJDBC";
            String username="root";
            String password="LcvR17M@";
            Connection con=DriverManager.getConnection(url, username, password);

            //Creating object of prepareStatement to fire query
            String q="insert into table1(tname,tcity) values(?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);

            //Asking how many values we want to enter
            Scanner sc=new Scanner(System.in);
            System.out.print("How many values you want to enter: ");
            int num=sc.nextInt();

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            int i=1;
            while(i<=num)
            {
                System.out.print("Enter the name you want to enter: ");
                String name=br.readLine();

                System.out.print("Enter the city name: ");
                String city=br.readLine();

                pstmt.setString(1,name);
                pstmt.setString(2,city);

                pstmt.executeUpdate();
                System.out.println("Values Successfully Inserted");

                i++;
            }

            con.close();

        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
