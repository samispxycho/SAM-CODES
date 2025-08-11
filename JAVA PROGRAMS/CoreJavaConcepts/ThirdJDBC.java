//Inserting values dynamically to a table

import java.sql.*;
public class ThirdJDBC {
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

            //creating a dynamic or parameterized query
            String q="insert into table1 (tname,tcity) values (?,?)";

            //Creating an object of prepared statement
            PreparedStatement pstmt=con.prepareStatement(q);

            pstmt.setString(1,"Marshall Mathers"); //here 1 is pointing to the first '?'
            pstmt.setString(2,"Detroit");//2 is pointing to the second '?'
            //tname and tcity are string type values thats why we used setString..
            //if integer we will have to use setInt and so on..

            //To insert more values, just change the data above and run program again

            pstmt.executeUpdate(); //to make changes to the database (dont have to pass 'q' here)
            System.out.println("Values Inserted");

            con.close();
            
        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
