//Creating a table

import java.sql.*;

public class SecondJDBC {
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

            //Creating a query
            String q="create table Table1(tid int(20)primary key auto_increment,tname varchar(200) not null,tcity varchar(200))";

            //create object of statement class
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created");

            //closing connection
            con.close();

        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }   
    }
}
