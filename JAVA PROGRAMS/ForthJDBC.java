//Taking input from user---->1 at a time

import java.sql.*;
import java.io.*;       //IO package imported

public class ForthJDBC {
    public static void main(String[] args) {
        try 
        {
            //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Creating a connection
            String url="jdbc:mysql://localhost:3306/javaJDBC";
            String username="root";
            String password="LcvR17M@";

            Connection con=DriverManager.getConnection(url,username,password);

            String q="insert into table1 (tname,tcity) values (?,?)";

            PreparedStatement pstmt=con.prepareStatement(q);

            //Taking input from the user
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //allows user to enter data

            System.out.print("Enter the name: ");
            String name=br.readLine();

            System.out.print("Enter city");
            String city=br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();
            System.out.println("Values inserted");

            con.close();

        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
