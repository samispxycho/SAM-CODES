//to retrieve information from the database

import java.sql.*;

public class SeventhJDBC {
    public static void main(String[] args) {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/javaJDBC";
            String username="root";
            String password="LcvR17M@";
            Connection con=DriverManager.getConnection(url, username, password);

            String q="select * from table1";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);

            while(set.next())
            {
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);

                System.out.println(id +": "+name +": "+city);
            }
            con.close();



        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
