//To establish Connection

import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args) {
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Creating a connection
            String url="jdbc:mysql://localhost:3306/javaJDBC";
            String username="root";
            String password="LcvR17M@";

            Connection con=DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }
            else 
            {
                System.out.println("Connected");
            }



        }catch(Exception e) 
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
